// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void area();

    // Regular method
    void description() {
        System.out.println("This is a shape.");
    }
}

// Subclass 1
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implement abstract method
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Circle area: " + result);
    }
}

// Subclass 2
class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    void area() {
        double result = length * width;
        System.out.println("Rectangle area: " + result);
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        c.description();
        c.area();

        System.out.println();

        Shape r = new Rectangle(4, 6);
        r.description();
        r.area();
    }
}
