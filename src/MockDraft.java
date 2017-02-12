import org.json.JSONException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class MockDraft {

    public static void main(String[] args) throws InterruptedException{
        //create mockDraft instance & parse prospect data
        MockDraft mockDraft = new MockDraft();
        String text = "";
        try {
            Scanner scanner = new Scanner(new File("Prospects.JSON"));
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
        }
        catch (JSONException je) {
            System.out.println("Error in JSON data." + '\n');
        }

        //initialize myTeam and myPick
        System.out.println("Please enter your team, or 'random' if you'd like a random team assigned to you." + '\n');
        Scanner scan = new Scanner(System.in);
        String t = scan.nextLine().toLowerCase();
        Team myTeam;
        int myPick;

        if (t.equals("random")) {
            myPick = 1 + (int)(Math.random() * 32);
            myTeam = mockDraft.getTeam(myPick);
        }
        else {
            myTeam = mockDraft.getTeam(t);
            myPick = myTeam.getPick();
        }

        //     playerSelection -> player being selected in a given round
        Player playerSelection;
        //     selectionName   -> name of player being selected in a given round
        String selectionName = "";
        //     selectionPos    -> name of position of player being selected in a given round
        String selectionPos = "";

        Thread.sleep(1000);
        System.out.println('\n' +"Welcome to the 2017 NFL Draft. You will be drafting as the " + myTeam.getName()
                            + "." + '\n' );
        Thread.sleep(2000);

        //TODO: String 'nth' value being 'st' for pick == 1, 'nd' for pick == 2,
        //TODO: 'rd' for pick ==3, 'th' otherwise
        System.out.println("You will be selecting at pick " + Integer.toString(myPick) + "." + '\n');
        Thread.sleep(3000);

        //iterate through first round by pick
        for (int n = 1; n <= 32; n++) {
            if (n == myPick) {
                playerSelection = mockDraft.draft(myPick, myTeam.getName(), draftables, drafted);
                selectionName = playerSelection.getName();
                selectionPos = playerSelection.getPositionName();
                drafted.add(playerSelection);
            }
            else {
                Player AIDraftee = mockDraft.AIdraft(mockDraft.getTeam(n), draftables, drafted);
                drafted.add(AIDraftee);
                //AIDraftee = new Player("John Hunchak", Position.ILB, 3);
                System.out.println("With pick " + Integer.toString(n) + " the " +
                                    mockDraft.getTeam(n).getName() + " select " +
                                    AIDraftee.getName() + ", " + AIDraftee.getPositionName() + ", " + AIDraftee.getSchool() + "." + '\n' );
            }
            Thread.sleep(1500);
        }
        //TODO: add another round using counter 'pickCounter', each loop is new round beginning at
        //TODO: pickCounter = 32 (round 2), 64 (round 3), etc.

        //TODO: alternative: helper function 'draftRounds(int rounds, ...)' that receives the number of
        //TODO: round to draft, using 'rounds' as a decreasing counter to 0

        System.out.println("Thank you for attending the 2017 NFL Draft. Here is your 2017 draft class: " + '\n' +
                            "Round 1: " + selectionName + ", " + selectionPos);
    }


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


    private Player draft(int pick, String team, List<Player> selectableList, List<Player> selectedList) {
        Player mySelection = null;

        //TODO: advice function that provides 3/4 players (w/ highest score) with custom descriptions

        System.out.println("The " + team + " are on the clock! Enter your selection below." + '\n' + '\n' );
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().toLowerCase();
        for (Player p: selectableList) {
            if (p.getName().toLowerCase().contains(s)) {
                mySelection = p;
            }
        }
        if (mySelection == null || selectedList.contains(mySelection)) {
            System.out.println('\n' + "Please select a remaining draft-eligible player." + '\n' );
            draft(pick, team, selectableList, selectedList);
        }
        if (mySelection != null) {
            System.out.println("With pick " + Integer.toString(pick) + " the " + team + " select " +
                    mySelection.getName() + ", " + mySelection.getPositionName()+ ", " + mySelection.getSchool() + "."  + '\n' );
        }

        return mySelection;
    }


    private Player AIdraft(Team team, List<Player> selectableList, List<Player> selectedList) {
        List<Position> teamNeeds = team.getNeeds();
        List<Player> draftBoard = new ArrayList<>();
        Player draftee = null;

        Player selection = draftValues(selectableList, selectedList,  teamNeeds);
        return selection;
    }


    private Player draftValues(List<Player> draftBoard, List<Player> selected, List<Position> teamNeeds) {
        Random generator = new Random();
        double random = generator.nextDouble();
        double playerScore = 0;
        double highestScore = 0;
        Player bestSelection = null;
        //iterate through the draft board, give each player score, and sort by score...
        for (Player p: draftBoard) {
            //TODO: change constants to local variable factors
            playerScore += (random * 1000.0)/((p.getRank()/2));
            if(p.getPositionName().equals("QB") && teamNeeds.contains(p.getPosition())) {
                playerScore += 90.0;
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
            }
            */
            playerScore = 0;
        }
        return bestSelection;
    }

    static String readFile(String path, Charset encoding)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

}
