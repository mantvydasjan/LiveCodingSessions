package nba;

public class Player extends Person implements Comparable<Player>{

    private int pointsPerGame;
    private int assistsPerGame;
    private int reboundsPerGame;

    public Player(String name, int age, int salary, int pointsPerGame, int assistsPerGame, int reboundsPerGame) {
        super(name, age, salary);
        this.pointsPerGame = pointsPerGame;
        this.assistsPerGame = assistsPerGame;
        this.reboundsPerGame = reboundsPerGame;
    }

    public int getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(int pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public int getAssistsPerGame() {
        return assistsPerGame;
    }

    public void setAssistsPerGame(int assistsPerGame) {
        this.assistsPerGame = assistsPerGame;
    }

    public int getReboundsPerGame() {
        return reboundsPerGame;
    }

    public void setReboundsPerGame(int reboundsPerGame) {
        this.reboundsPerGame = reboundsPerGame;
    }

    @Override
    public String toString() {
        return "Player{" +
                "pointsPerGame=" + pointsPerGame +
                ", assistsPerGame=" + assistsPerGame +
                ", reboundsPerGame=" + reboundsPerGame +
                '}';
    }

    @Override
    public int compareTo(Player playerToCompare) {
        if(this.pointsPerGame == playerToCompare.getPointsPerGame()) {
            return 0;
        } else {
            return this.pointsPerGame > playerToCompare.getPointsPerGame() ? 1 : -1;
        }

    }
}
