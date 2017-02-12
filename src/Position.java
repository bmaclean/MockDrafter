public enum Position {
    QB, RB, FB, WR, TE, OT, OG, C,
    CB, S, DT, OLB, ILB, EDGE,
    K, P;

    public String getName() {
        String name = "No position found";
        switch(this) {
            case QB: name = "QB";
                     break;
            case RB: name = "RB";
                     break;
            case FB: name = "FB";
                     break;
            case WR: name = "WR";
                     break;
            case TE: name = "TE";
                     break;
            case OT: name = "OT";
                     break;
            case OG: name = "OG";
                     break;
            case C: name = "C";
                     break;
            case CB: name = "CB";
                     break;
            case S: name = "S";
                     break;
            case DT: name = "DL";
                     break;
            case OLB: name = "OLB";
                     break;
            case ILB: name = "LB";
                     break;
            case EDGE: name = "EDGE";
                     break;
            case K: name = "K";
                     break;
            case P: name = "P";
                     break;
        }
        return name;
    }
}