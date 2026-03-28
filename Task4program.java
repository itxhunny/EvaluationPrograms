// Abstract class
abstract class Shape {
    abstract double calculateArea();
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Main class
class Main {
    public static void main(String[] args) {

        Shape shape;
        shape = new Circle(7);
        System.out.println("Circle Area: " + shape.calculateArea());

        shape = new Triangle(5, 10);
        System.out.println("Triangle Area: " + shape.calculateArea());

        shape = new Rectangle(4, 8);
        System.out.println("Rectangle Area: " + shape.calculateArea());
    }
}