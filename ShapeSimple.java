abstract class Shape {
    
    // Abstract method
    abstract void calculateArea();

    // Concrete method
    void display() {
        System.out.println("This is a shape");
    }
}

// Circle class
class Circle extends Shape {
    int radius = 5;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area = " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {
    int length = 4;
    int width = 6;

    void calculateArea() {
        int area = length * width;
        System.out.println("Rectangle Area = " + area);
    }
}

// Main class
public class ShapeSimple {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.display();
        c.calculateArea();

        Rectangle r = new Rectangle();
        r.display();
        r.calculateArea();
    }
}