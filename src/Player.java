public class Player {

    private String name;
    private String school;
    private int rank;
    private Position position;

    public Player(String name, Position pos, int rank, String school) {
        this.name = name;
        this.position = pos;
        this.rank = rank;
        this.school = school;
    }

    int getRank() {
        return rank;
    }

    public void setRank(int newRank) {
        this.rank = newRank;
    }

    String getName() {
        return name;
    }

    Position getPosition() {
        return position;
    }

    String getSchool() {
        return school;
    }

    public String getPositionName() {
        return position.getName();
    }
}