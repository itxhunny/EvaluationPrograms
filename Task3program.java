class AreaCalculator {

    // Circle
    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    // Rectangle OR Triangle (using shape)
    double calculateArea(double a, double b, String shape) {

        if (shape.equalsIgnoreCase("rectangle")) {
            return a * b;
        }
        else if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * a * b;
        }
        else {
            return 0;
        }
    }
}

class Main {
    public static void main(String[] args) {

        AreaCalculator obj = new AreaCalculator();

        double circle = obj.calculateArea(5);
        double rectangle = obj.calculateArea(4, 6, "rectangle");
        double triangle = obj.calculateArea(4, 6, "triangle");

        System.out.println("Circle Area: " + circle);
        System.out.println("Rectangle Area: " + rectangle);
        System.out.println("Triangle Area: " + triangle);
    }
}