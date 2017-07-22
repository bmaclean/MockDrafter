import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Brendan on 2017-01-17.
 */
public enum Team {
    //pick order based on Vegas Insider
    //AFCS
    IND("Indianapolis Colts", new ArrayList<>(Arrays.asList(Position.EDGE, Position.RB, Position.ILB, Position.CB)), picks(24)),
    TEN("Tennessee Titans", new ArrayList<>(Arrays.asList(Position.WR, Position.CB, Position.TE)), picks(14)),
    HOU("Houston Texans", new ArrayList<>(Arrays.asList(Position.QB, Position.ILB, Position.OT)), picks(16)),
    JAX("Jacksonville Jaguars", new ArrayList<>(Arrays.asList(Position.OT, Position.DT, Position.S)), picks(9)),

    //AFCN
    CIN("Cincinatti Bengals", new ArrayList<>(Arrays.asList(Position.C, Position.ILB, Position.OLB, Position.EDGE)), picks(10)),
    PIT("Pittsburgh Steelers", new ArrayList<>(Arrays.asList(Position.ILB, Position.OLB, Position.TE)), picks(26)),
    BAL("Baltimore Ravens", new ArrayList<>(Arrays.asList(Position.EDGE, Position.OLB, Position.C, Position.WR)), picks(17)),
    CLE("Cleveland Browns", new ArrayList<>(Arrays.asList(Position.QB, Position.EDGE, Position.RB)), picks(3)),

    //AFCE
    NE("New England Patriots", new ArrayList<>(Arrays.asList(Position.OT, Position.ILB, Position.EDGE, Position.S)), picks(31)),
    MIA("Miami Dolphins", new ArrayList<>(Arrays.asList(Position.OG, Position.EDGE, Position.TE)), picks(8)),
    BUF("Buffalo Bills", new ArrayList<>(Arrays.asList(Position.OT, Position.WR, Position.CB, Position.S)), picks(6)),
    NYJ("New York Jets", new ArrayList<>(Arrays.asList(Position.QB, Position.OT, Position.CB, Position.EDGE)), picks(2)),

    //AFCW
    DEN("Denver Broncos", new ArrayList<>(Arrays.asList(Position.OT, Position.TE, Position.OG)), picks(23)),
    KC("Kansas City Chiefs", new ArrayList<>(Arrays.asList(Position.ILB, Position.DT, Position.CB)), picks(22)),
    OAK("Oakland Raiders", new ArrayList<>(Arrays.asList(Position.ILB, Position.DT, Position.CB)), picks(27)),
    LAC("Los Angeles Chargers", new ArrayList<>(Arrays.asList(Position.OT, Position.WR, Position.QB)), picks(15)),

    //NFCS
    TB("Tampa Bay Buccaneers", new ArrayList<>(Arrays.asList(Position.OT, Position.S, Position.WR)), picks(20)),
    CAR("Carolina Panthers", new ArrayList<>(Arrays.asList(Position.OT, Position.CB, Position.RB)), picks(21)),
    NO("New Orleans Saints", new ArrayList<>(Arrays.asList(Position.S, Position.CB, Position.ILB)), picks(12)),
    ATL("Atlanta Falcons", new ArrayList<>(Arrays.asList(Position.DT, Position.CB, Position.EDGE)), picks(30)),

    //NFCN
    DET("Detroit Lions", new ArrayList<>(Arrays.asList(Position.CB, Position.EDGE, Position.ILB, Position.OLB)), picks(13)),
    MIN("Minnesota Vikings", new ArrayList<>(Arrays.asList(Position.OT, Position.RB, Position.DT)), picks(18)),
    GB("Green Bay Packers", new ArrayList<>(Arrays.asList(Position.CB, Position.ILB, Position.OLB, Position.EDGE)), picks(29)),
    CHI("Chicago Bears", new ArrayList<>(Arrays.asList(Position.QB, Position.CB, Position.S)), picks(4)),

    //NFCE
    DAL("Dallas Cowboys", new ArrayList<>(Arrays.asList(Position.EDGE, Position.CB, Position.TE)), picks(32)),
    PHI("Philadelphia Eagles", new ArrayList<>(Arrays.asList(Position.CB, Position.WR, Position.RB)), picks(11)),
    WAS("Washington Redskins", new ArrayList<>(Arrays.asList(Position.DT, Position.CB, Position.S, Position.ILB)), picks(7)),
    NYG("New York Giants", new ArrayList<>(Arrays.asList(Position.ILB, Position.OLB, Position.RB)), picks(25)),

    //NFCW
    SEA("Seattle Seahawks", new ArrayList<>(Arrays.asList(Position.OT, Position.DT, Position.CB)), picks(28)),
    ARI("Arizona Cardinals", new ArrayList<>(Arrays.asList(Position.ILB, Position.QB, Position.CB)), picks(19)),
    LAR("Los Angeles Rams", new ArrayList<>(Arrays.asList(Position.CB, Position.WR, Position.OG)), picks(5)),
    SF("San Francisco 49ers", new ArrayList<>(Arrays.asList(Position.QB, Position.OLB, Position.WR)), picks(1));

    private String name;
    private ArrayList<Position> needs;
    private ArrayList<Integer> picks;

    Team(String name, ArrayList<Position> needs, ArrayList<Integer> picks) {
        this.name = name;
        this.needs = needs;
        this.picks = picks;
    }

    public int getPick() {
        return picks.get(0);
    }

    public String getName() {
        return name;
    }

    public List<Position> getNeeds() {
        return needs;
    }

    public void removePosition(Position p) {
        if (needs.contains(p)) {
            needs.remove(p);
        }
    }

    //returns list of picks based on first round pick
    //TODO: doesn't consider tied records or compensatory picks
    private static ArrayList<Integer> picks(Integer firstPick) {
        ArrayList<Integer> retPicks = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            retPicks.add(firstPick*i);
        }
        return retPicks;
    }
}
