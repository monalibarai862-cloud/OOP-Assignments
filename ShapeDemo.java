class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}
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
public class ShapeDemo {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        c.display();
        c.area();

        System.out.println();
        r.display();
        r.area();
    }
}
