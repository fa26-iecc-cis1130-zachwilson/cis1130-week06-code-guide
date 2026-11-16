/*
 * Chapter 9: creating and using Rectangle objects.
 * Compile both files together:  javac Rectangle.java RectangleDemo.java
 * Run:                           java RectangleDemo
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle desk = new Rectangle(4.5, 2.0);   // new calls the constructor
        Rectangle tile = new Rectangle();           // no-arg constructor: 1 x 1
        Rectangle bad = new Rectangle(-3, 2);       // setter fixes the bad width

        System.out.println(desk);                   // uses toString()
        System.out.println(tile);
        System.out.println(bad);

        // Call methods on an object with the dot operator
        System.out.println("Desk perimeter: " + desk.getPerimeter());

        // Change an object through its setter, not by touching the field
        desk.setWidth(5.0);
        System.out.println("After resizing: " + desk);

        // desk.width = 99;   // Won't compile: width is private

        // Static methods are called on the class, not an object
        System.out.println("Rectangles created: " + Rectangle.getCount());
    }
}
