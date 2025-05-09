import java.util.*;

class Rectangle {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        double a;
        a = length * breadth;
        System.out.println("Area of rectangle is: " + a);
    }

    void perimeter() {
        double p;
        p = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle is: " + p);
    }
}

class c2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle r = new Rectangle(l, b);
        r.area();
        r.perimeter();
    }
}