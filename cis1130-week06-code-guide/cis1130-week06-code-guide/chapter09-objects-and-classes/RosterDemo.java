/*
 * Chapter 9: an array of objects.
 * Compile:  javac Player.java RosterDemo.java
 * Run:      java RosterDemo
 */
public class RosterDemo {
    public static void main(String[] args) {
        // An array of Player REFERENCES. Each element points to a Player object.
        Player[] roster = {
            new Player("Ava", 54, 4),
            new Player("Ben", 43, 4),
            new Player("Cara", 77, 4)
        };

        // An array made with new starts full of null until you fill it
        Player[] bench = new Player[2];
        System.out.println("bench[0] before filling: " + bench[0]);

        for (Player p : roster) {
            System.out.println(p);
        }

        // Find the best average: same pattern as Week 5, but call a method on each object
        int best = 0;
        for (int i = 1; i < roster.length; i++) {
            if (roster[i].getAverage() > roster[best].getAverage()) {
                best = i;
            }
        }
        System.out.println("Top scorer: " + roster[best].getName());

        // Change one object in the array
        roster[1].addGame(20);
        System.out.println("After Ben's 5th game: " + roster[1]);
    }
}
