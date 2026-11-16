/*
 * Chapter 9: Objects and Classes
 * Rectangle is a class: a blueprint. Each Rectangle object has its own width and height.
 *
 * UML class diagram:
 *   Rectangle
 *   -------------------------------
 *   -width: double
 *   -height: double
 *   -count: int  (static, shared by all rectangles)
 *   -------------------------------
 *   +Rectangle()
 *   +Rectangle(width: double, height: double)
 *   +getWidth(): double
 *   +getHeight(): double
 *   +setWidth(width: double): void
 *   +setHeight(height: double): void
 *   +getArea(): double
 *   +getPerimeter(): double
 *   +getCount(): int  (static)
 *   +toString(): String
 *
 *   - means private, + means public
 */
public class Rectangle {
    // Instance variables (fields): every object gets its own copy
    private double width;
    private double height;

    // Static variable: ONE copy shared by the whole class
    private static int count = 0;

    // No-arg constructor: a 1 by 1 rectangle
    public Rectangle() {
        this(1.0, 1.0);   // calls the other constructor
    }

    // Constructor with parameters
    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
        count++;
    }

    // Getters (accessors)
    public double getWidth() { return width; }
    public double getHeight() { return height; }

    // Setters (mutators) protect the data: no negative or zero sizes
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;     // this.width is the field; width is the parameter
        } else {
            this.width = 1.0;
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1.0;
        }
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static int getCount() {
        return count;
    }

    // toString is called automatically when you print an object
    public String toString() {
        return String.format("Rectangle %.1f x %.1f (area %.2f)", width, height, getArea());
    }
}
