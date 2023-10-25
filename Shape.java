
// Abstract class Shape
abstract class Shape1 {
    // Abstract method calculateArea()
    abstract double calculateArea();
}

// Intermediate subclass for 2D shapes
class TwoDShape extends Shape1 {
    // Implementation of calculateArea() for TwoDShape
    @Override
    double calculateArea() {
        return 0.0; // Default implementation for TwoDShape
    }
}

// Circle1 subclass
class Circle1 extends TwoDShape {
    private double radius;

    // Constructor for Circle
    public Circle1(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea() for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends TwoDShape {
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea() for Rectangle
    @Override
    double calculateArea() {
        return length * width;
    }
}

 class Main {
    public static void main(String[] args) {
        // Create a Circle and calculate its area
        Circle1 circle = new Circle1(5);
        double circleArea = circle.calculateArea();
        System.out.println("Area of the Circle with radius 5: " + circleArea);

        // Create a Rectangle and calculate its area
        Rectangle rectangle = new Rectangle(4, 6);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Area of the Rectangle with length 4 and width 6: " + rectangleArea);
    }
}
