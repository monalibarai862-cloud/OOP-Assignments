// Base class
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

// Derived class 1: Circle
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Derived class 2: Rectangle
class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        // Using Circle
        c.display();
        c.area();

        System.out.println();

        // Using Rectangle
        r.display();
        r.area();
    }
}
