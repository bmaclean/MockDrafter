import org.json.JSONException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class MockDraft {

    private Team getTeam(int pick) {
        Team myTeam = Team.IND;
        for (Team t : Team.values()) {
            if (pick == t.getPick()) {
                myTeam = t;
            }
        }
        return myTeam;
    }

    private Team getTeam(String name) {
        Team myTeam = Team.ATL;
        for (Team t : Team.values()) {
            if (t.getName().toLowerCase().contains(name.toLowerCase())) {
                myTeam = t;
            }
        }
        return myTeam;
    }

    private void trade(Team teamA, List<Integer> teamAPicks, Team teamB, List<Integer> teamBPicks) {

    }

    private Player draft(int pick, Team team, List<Player> selectableList, List<Player> selectedList) {
        Player mySelection = null;

        System.out.println("The " + team.getName() + " are on the clock! Enter your selection below." + '\n'
                + "If you would like some suggestions, enter 'help'." + '\n' );
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().toLowerCase();

        if (s.equals("help")) {
            draftSuggestions(team, selectableList, selectedList);
        }

        if (s.equals("trade")) {
            //TODO: add "trade" functionality - yields incoming random trade offers for current pick
            //      trade functionality based on online trade metrics - offers 'bad' deals

        }

        for (Player p: selectableList) {
            if (p.getName().toLowerCase().contains(s)) {
                mySelection = p;
            }
        }
        if (mySelection == null || selectedList.contains(mySelection)) {
            System.out.println('\n' + "Please select a remaining draft-eligible player." + '\n' );
            return null;
        }
        if (mySelection != null) {
            System.out.println("With pick " + Integer.toString(pick) + " the " + team.getName() + " select " +
                    mySelection.getName() + ", " + mySelection.getPositionName()+ ", " + mySelection.getSchool() + "."  + '\n' );
        }
        return mySelection;
    }

    private void draftSuggestions(Team team, List<Player> selectableList, List<Player> selectedList) {

        List<Player> suggestableList = new ArrayList<>(selectableList);
        Player suggestion;

        for (int i = 5; i > 0; i--) {
            //TODO: format PLAYER \n DESCRIPTION \n'
            // add all previous suggestions to selectedList to prevent duplicates
            // excluding the first iteration
            suggestion = draftValues(suggestableList, selectedList, team.getNeeds());
            suggestableList.remove(suggestion);
            System.out.println(suggestion.getName() + ", " + suggestion.getPositionName());
        }

    }


    private Player AIdraft(Team team, List<Player> selectableList, List<Player> selectedList) {
        List<Position> teamNeeds = team.getNeeds();

        return draftValues(selectableList, selectedList,  teamNeeds);
    }


    private Player draftValues(List<Player> draftBoard, List<Player> selected, List<Position> teamNeeds) {
        Random generator = new Random();
        double random = generator.nextDouble();
        double playerScore = 0;
        double highestScore = 0;
        Player bestSelection = null;
        //iterate through the draft board, give each player score, and sort by score...
        for (Player p: draftBoard) {
            //TODO: change constants to scalable factors
            playerScore += (random * 400.0)/((p.getRank() + 1) / 2);
            if(p.getPositionName().equals("QB") && teamNeeds.contains(p.getPosition())) {
                playerScore += 100.0/p.getRank();
                //System.out.println("QB score boost applied.");
            }

            if(p.getPositionName().equals("QB") && !teamNeeds.contains(p.getPosition())) {
                playerScore -= 100.0/p.getRank();
                //System.out.println("QB score reduction applied.");
            }

            if(p.getPositionName().equals("EDGE")) {
                playerScore += 5.0;
            }

            if(teamNeeds.contains(p.getPosition())) {
                playerScore += 10.0;
            }

            if ((playerScore > highestScore || bestSelection == null) && !selected.contains(p)) {
                bestSelection = p;
                highestScore = playerScore;
            }
            //to see scores:
               /*
            if (!selected.contains(p)) {
                System.out.println(p.getName() + " " + playerScore);
            }*/

            playerScore = 0;
        }
        return bestSelection;
    }


    public static void main(String[] args) throws InterruptedException {
        int LONG_PAUSE = 0;//3000;
        int MED_PAUSE = 0;//2000;
        int SHORT_PAUSE = 0;//1000;

        //create mockDraft instance & parse prospect data
        MockDraft mockDraft = new MockDraft();
        String text = "";
        try {
            Scanner scanner = new Scanner(new File("2018Prospects.JSON"));
            text = scanner.useDelimiter("\\A").next();
            scanner.close();
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("Prospects file not found.");
        }

        ProspectParser parser = new ProspectParser(text);
        //generate list of draftable players, and list of already drafted players
        List<Player> draftables = null;
        List<Player> drafted = new ArrayList<>();

        try {
            draftables = parser.parse();
        } catch (JSONException je) {
            System.out.println("Error in JSON data." + '\n');
        }

        //initialize myTeam and myPick
        System.out.println("Please enter your team, or 'random' if you'd like a random team assigned to you." + '\n');
        Scanner scan = new Scanner(System.in);
        String t = scan.nextLine().toLowerCase();
        Team myTeam;
        int myPick;

        if (t.equals("random")) {
            myPick = 1 + (int) (Math.random() * 32);
            myTeam = mockDraft.getTeam(myPick);
        } else {
            myTeam = mockDraft.getTeam(t);
            myPick = myTeam.getPick();
        }
        Thread.sleep(MED_PAUSE);

        System.out.println('\n' + "How many rounds would you like to draft? Please enter a number between 1 and 7." + '\n');
        Scanner scan2 = new Scanner(System.in);
        Integer rounds = Integer.parseInt(scan2.nextLine());

        //     playerSelection -> player being selected in a given round
        Player playerSelection = null;
        //     selectionName   -> name of player being selected in a given round
        String selectionName = "";
        //     selectionPos    -> name of position of player being selected in a given round
        String selectionPos = "";
        //     draftClass      -> list of players selected by user team
        List<Player> draftClass = new ArrayList<>();

        Thread.sleep(SHORT_PAUSE);
        System.out.println('\n' + "Welcome to the 2017 NFL Draft. You will be drafting as the " + myTeam.getName()
                + "." + '\n');
        Thread.sleep(MED_PAUSE);

        String suffix;

        System.out.println("You will be selecting at pick " + Integer.toString(myPick) + "." + '\n');
        Thread.sleep(LONG_PAUSE);

        //iterate through first round by pick
        for (int r = 1; r <= rounds; r++) {
            System.out.println("Round " + Integer.toString(r) + " is beginning." + '\n');
            for (int n = 1; n <= 32; n++) {
                switch (n) {
                    case 1:
                    case 21:
                    case 31:
                        suffix = "st";
                        break;
                    case 2:
                    case 22:
                    case 32:
                        suffix = "nd";
                        break;
                    case 3:
                    case 23:
                    case 33:
                        suffix = "rd";
                        break;
                    default:
                        suffix = "th";

                }
                if (n == myPick) {
                    // set playerSelection to null at the beginning of each pick - allows loop to
                    // continue if selection is invalid
                    playerSelection = null;
                    while(playerSelection == null) {
                        playerSelection = mockDraft.draft(myPick, myTeam, draftables, drafted);
                    }
                    draftClass.add(playerSelection);
                    drafted.add(playerSelection);
                } else {
                    Player AIDraftee = mockDraft.AIdraft(mockDraft.getTeam(n), draftables, drafted);
                    drafted.add(AIDraftee);
                    mockDraft.getTeam(n).removePosition(AIDraftee.getPosition());
                    System.out.println("With the " + Integer.toString(n * r) + suffix + " overall pick, the " +
                            mockDraft.getTeam(n).getName() + " select " +
                            AIDraftee.getName() + ", " + AIDraftee.getPositionName() + ", " + AIDraftee.getSchool() + "." + '\n');
                }
                Thread.sleep(SHORT_PAUSE);
            }

        }

        //TODO: summary mechanic displays the same player n times
        System.out.println("Thank you for attending the 2017 NFL Draft. Here is your 2017 draft class: " + '\n');
        for (int r = 0; r < rounds; r++) {
            System.out.println("Round " + Integer.toString(r + 1) + ": " + draftClass.get(r).getName() + ", "
                    + draftClass.get(r).getPositionName() + ", " + draftClass.get(r).getSchool());
        }
    }


}
