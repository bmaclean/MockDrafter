import java.util.Arrays;
import java.util.List;

/**
 * Created by Brendan on 2017-01-17.
 */
public enum Team {
    //AFCS
    IND("Indianapolis Colts", Arrays.asList(Position.EDGE, Position.RB, Position.ILB, Position.CB), 14),
    TEN("Tennessee Titans", Arrays.asList(Position.WR, Position.CB, Position.TE), 18),
    HOU("Houston Texans", Arrays.asList(Position.QB, Position.ILB, Position.OT), 25),
    JAX("Jacksonville Jaguars", Arrays.asList(Position.OT, Position.DT, Position.S), 4),

    //AFCN
    CIN("Cincinatti Bengals", Arrays.asList(Position.C, Position.ILB, Position.OLB, Position.EDGE), 9),
    PIT("Pittsburgh Steelers", Arrays.asList(Position.ILB, Position.OLB, Position.TE), 30),
    BAL("Baltimore Ravens", Arrays.asList(Position.EDGE, Position.S, Position.WR), 16),
    CLE("Cleveland Browns", Arrays.asList(Position.QB, Position.EDGE, Position.RB), 1),

    //AFCE
    NE("New England Patriots", Arrays.asList(Position.OT, Position.ILB, Position.OLB, Position.RB), 32),
    MIA("Miami Dolphins", Arrays.asList(Position.OG, Position.EDGE, Position.TE), 22),
    BUF("Buffalo Bills", Arrays.asList(Position.OT, Position.WR, Position.CB, Position.S), 10),
    NYJ("New York Jets", Arrays.asList(Position.QB, Position.OT, Position.CB, Position.EDGE), 6),

    //AFCW
    DEN("Denver Broncos", Arrays.asList(Position.OT, Position.TE, Position.OG), 20),
    KC("Kansas City Chiefs", Arrays.asList(Position.ILB, Position.DT, Position.CB), 27),
    OAK("Oakland Raiders", Arrays.asList(Position.ILB, Position.DT, Position.CB), 24),
    LAC("Los Angeles Chargers", Arrays.asList(Position.OT, Position.WR, Position.QB), 7),

    //NFCS
    TB("Tampa Bay Buccaneers", Arrays.asList(Position.OT, Position.S, Position.WR), 19),
    CAR("Carolina Panthers", Arrays.asList(Position.OT, Position.CB, Position.RB), 8),
    NO("New Orleans Saints", Arrays.asList(Position.S, Position.CB, Position.ILB), 11),
    ATL("Atlanta Falcons", Arrays.asList(Position.DT, Position.CB, Position.EDGE), 31),

    //NFCN
    DET("Detroit Lions", Arrays.asList(Position.CB, Position.EDGE, Position.ILB, Position.OLB), 21),
    MIN("Minnesota Vikings", Arrays.asList(Position.OT, Position.RB, Position.DT), 15),
    GB("Green Bay Packers", Arrays.asList(Position.CB, Position.ILB, Position.OLB, Position.EDGE), 29),
    CHI("Chicago Bears", Arrays.asList(Position.QB, Position.CB, Position.S), 3),

    //NFCE
    DAL("Dallas Cowboys", Arrays.asList(Position.EDGE, Position.CB, Position.TE), 28),
    PHI("Philadelphia Eagles", Arrays.asList(Position.CB, Position.WR, Position.RB), 12),
    WAS("Washington Redskins", Arrays.asList(Position.DT, Position.CB, Position.S, Position.ILB), 17),
    NYG("New York Giants", Arrays.asList(Position.ILB, Position.OLB, Position.RB), 23),

    //NFCW
    SEA("Seattle Seahawks", Arrays.asList(Position.OT, Position.DT, Position.CB), 26),
    ARI("Arizona Cardinals", Arrays.asList(Position.ILB, Position.QB, Position.CB), 13),
    LAR("Los Angeles Rams", Arrays.asList(Position.CB, Position.WR, Position.OG), 5),
    SF("San Francisco 49ers", Arrays.asList(Position.QB, Position.OLB, Position.WR), 2);

    private String name;
    private List<Position> needs;
    private int pick;

    Team(String name, List<Position> needs, int pick) {
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
}
