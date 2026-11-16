/*
 * Chapter 10: a tiny class used by ReferencesDemo.
 */
public class Counter {
    private int value;

    public Counter(int start) {
        value = start;
    }

    public void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}
