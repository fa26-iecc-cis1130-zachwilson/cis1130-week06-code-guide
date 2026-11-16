/*
 * Chapter 9: a class used in an array of objects (see RosterDemo).
 */
public class Player {
    private String name;
    private int points;
    private int games;

    public Player(String name, int points, int games) {
        this.name = name;
        this.points = points;
        this.games = games;
    }

    public String getName() { return name; }
    public int getPoints() { return points; }
    public int getGames() { return games; }

    public double getAverage() {
        if (games == 0) {
            return 0.0;
        }
        return (double) points / games;
    }

    public void addGame(int newPoints) {
        if (newPoints >= 0) {
            points += newPoints;
            games++;
        }
    }

    public String toString() {
        return String.format("%-6s %3d pts in %d games (%.2f avg)", name, points, games, getAverage());
    }
}
