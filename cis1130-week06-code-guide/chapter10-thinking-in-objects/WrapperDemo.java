/*
 * Chapter 10: wrapper classes (Integer, Double, Character, Boolean).
 * Run:  javac WrapperDemo.java  then  java WrapperDemo
 */
public class WrapperDemo {
    public static void main(String[] args) {
        // Parsing: turn text into numbers
        int age = Integer.parseInt("19");
        double price = Double.parseDouble("4.75");
        System.out.println("Next year: " + (age + 1) + ", two items: " + (price * 2));

        // Useful constants
        System.out.println("Largest int: " + Integer.MAX_VALUE);
        System.out.println("Smallest int: " + Integer.MIN_VALUE);

        // Autoboxing (int to Integer) and unboxing (Integer to int)
        Integer boxed = 42;          // autoboxing
        int unboxed = boxed + 8;     // unboxing
        System.out.println("unboxed: " + unboxed);

        // Converting back to text
        String text = Integer.toString(255);
        System.out.println("Length of \"" + text + "\": " + text.length());

        // Character helpers
        char ch = '7';
        System.out.println(ch + " is a digit? " + Character.isDigit(ch));
        System.out.println("Uppercase of q: " + Character.toUpperCase('q'));

        // Compare wrapper objects with equals, not ==
        Integer x = 1000;
        Integer y = 1000;
        System.out.println("x.equals(y): " + x.equals(y));    // true
        System.out.println("x == y: " + (x == y));            // false here: two different objects
    }
}
