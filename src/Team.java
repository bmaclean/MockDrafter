import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Brendan on 2017-01-17.
 */
public enum Team {
    //AFCS
    //TODO: change pick to list of picks (as ints)
    IND("Indianapolis Colts", new ArrayList<>(Arrays.asList(Position.EDGE, Position.RB, Position.ILB, Position.CB)), 10),
    TEN("Tennessee Titans", new ArrayList<>(Arrays.asList(Position.WR, Position.CB, Position.TE)), 18),
    HOU("Houston Texans", new ArrayList<>(Arrays.asList(Position.QB, Position.ILB, Position.OT)), 25),
    JAX("Jacksonville Jaguars", new ArrayList<>(Arrays.asList(Position.OT, Position.DT, Position.S)), 5),

    //AFCN
    CIN("Cincinatti Bengals", new ArrayList<>(Arrays.asList(Position.C, Position.ILB, Position.OLB, Position.EDGE)), 7),
    PIT("Pittsburgh Steelers", new ArrayList<>(Arrays.asList(Position.ILB, Position.OLB, Position.TE)), 30),
    BAL("Baltimore Ravens", new ArrayList<>(Arrays.asList(Position.EDGE, Position.OLB, Position.C, Position.WR)), 9),
    CLE("Cleveland Browns", new ArrayList<>(Arrays.asList(Position.QB, Position.EDGE, Position.RB)), 6),

    //AFCE
    NE("New England Patriots", new ArrayList<>(Arrays.asList(Position.OT, Position.ILB, Position.EDGE, Position.S)), 32),
    MIA("Miami Dolphins", new ArrayList<>(Arrays.asList(Position.OG, Position.EDGE, Position.TE)), 22),
    BUF("Buffalo Bills", new ArrayList<>(Arrays.asList(Position.OT, Position.WR, Position.CB, Position.S)), 8),
    NYJ("New York Jets", new ArrayList<>(Arrays.asList(Position.QB, Position.OT, Position.CB, Position.EDGE)), 2),

    //AFCW
    DEN("Denver Broncos", new ArrayList<>(Arrays.asList(Position.OT, Position.TE, Position.OG)), 20),
    KC("Kansas City Chiefs", new ArrayList<>(Arrays.asList(Position.ILB, Position.DT, Position.CB)), 27),
    OAK("Oakland Raiders", new ArrayList<>(Arrays.asList(Position.ILB, Position.DT, Position.CB)), 24),
    LAC("Los Angeles Chargers", new ArrayList<>(Arrays.asList(Position.OT, Position.WR, Position.QB)), 7),

    //NFCS
    TB("Tampa Bay Buccaneers", new ArrayList<>(Arrays.asList(Position.OT, Position.S, Position.WR)), 19),
    CAR("Carolina Panthers", new ArrayList<>(Arrays.asList(Position.OT, Position.CB, Position.RB)), 8),
    NO("New Orleans Saints", new ArrayList<>(Arrays.asList(Position.S, Position.CB, Position.ILB)), 12),
    ATL("Atlanta Falcons", new ArrayList<>(Arrays.asList(Position.DT, Position.CB, Position.EDGE)), 31),

    //NFCN
    DET("Detroit Lions", new ArrayList<>(Arrays.asList(Position.CB, Position.EDGE, Position.ILB, Position.OLB)), 21),
    MIN("Minnesota Vikings", new ArrayList<>(Arrays.asList(Position.OT, Position.RB, Position.DT)), 11),
    GB("Green Bay Packers", new ArrayList<>(Arrays.asList(Position.CB, Position.ILB, Position.OLB, Position.EDGE)), 29),
    CHI("Chicago Bears", new ArrayList<>(Arrays.asList(Position.QB, Position.CB, Position.S)), 4),

    //NFCE
    DAL("Dallas Cowboys", new ArrayList<>(Arrays.asList(Position.EDGE, Position.CB, Position.TE)), 28),
    PHI("Philadelphia Eagles", new ArrayList<>(Arrays.asList(Position.CB, Position.WR, Position.RB)), 12),
    WAS("Washington Redskins", new ArrayList<>(Arrays.asList(Position.DT, Position.CB, Position.S, Position.ILB)), 17),
    NYG("New York Giants", new ArrayList<>(Arrays.asList(Position.ILB, Position.OLB, Position.RB)), 23),

    //NFCW
    SEA("Seattle Seahawks", new ArrayList<>(Arrays.asList(Position.OT, Position.DT, Position.CB)), 26),
    ARI("Arizona Cardinals", new ArrayList<>(Arrays.asList(Position.ILB, Position.QB, Position.CB)), 13),
    LAR("Los Angeles Rams", new ArrayList<>(Arrays.asList(Position.CB, Position.WR, Position.OG)), 1),
    SF("San Francisco 49ers", new ArrayList<>(Arrays.asList(Position.QB, Position.OLB, Position.WR)), 3);

    private String name;
    private ArrayList<Position> needs;
    private int pick;

    Team(String name, ArrayList<Position> needs, int pick) {
        this.name = name;
        this.needs = needs;
        this.pick = pick;
    }

    public int getPick() {
        return pick;
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
}
