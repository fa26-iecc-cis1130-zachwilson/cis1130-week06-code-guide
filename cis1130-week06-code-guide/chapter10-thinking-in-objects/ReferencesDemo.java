/*
 * Chapter 10: object references.
 * A variable of a class type holds a REFERENCE (an address), not the object itself.
 * Compile:  javac Counter.java ReferencesDemo.java
 * Run:      java ReferencesDemo
 */
public class ReferencesDemo {
    public static void main(String[] args) {
        // 1. Two variables can refer to the SAME object (aliasing)
        Counter a = new Counter(5);
        Counter b = a;            // copies the reference, not the object
        b.increment();
        System.out.println("a = " + a.getValue() + ", b = " + b.getValue());   // both 6

        // 2. == compares references; it asks "same object?"
        Counter c = new Counter(6);
        System.out.println("a == b: " + (a == b));   // true: same object
        System.out.println("a == c: " + (a == c));   // false: different objects, same value

        // 3. Strings: always compare contents with equals
        String s1 = new String("java");
        String s2 = new String("java");
        System.out.println("s1 == s2: " + (s1 == s2));           // false
        System.out.println("s1.equals(s2): " + s1.equals(s2));   // true

        // 4. Passing an object to a method passes a copy of the REFERENCE,
        //    so the method can change the caller's object...
        bump(a);
        System.out.println("After bump(a): " + a.getValue());   // 7

        // ...but passing a primitive passes a copy of the VALUE
        int n = 10;
        bumpInt(n);
        System.out.println("After bumpInt(n): " + n);           // still 10

        // 5. null means "refers to no object"
        Counter nothing = null;
        if (nothing == null) {
            System.out.println("nothing is null; calling a method on it would crash");
        }
    }

    public static void bump(Counter counter) {
        counter.increment();
    }

    public static void bumpInt(int number) {
        number++;
    }
}
