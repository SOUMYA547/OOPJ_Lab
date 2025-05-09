import java.util.*;

class Area {
    void area(double r) {
        System.out.println("Area of circle is: " + (3.14 * r * r));
    }

    void area(double b, double h) {
        System.out.println("Area of triangle is: " + (0.5 * b * h));
    }

    void area(double s1, double s2, double s3) {
        System.out.println("Area of square is: " + (s1 * s2 * s3));
    }
}

class c5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.println("Enter radius of circle: ");
        double r = sc.nextDouble();
        a.area(r);
        System.out.println("Enter base and height of triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        a.area(b, h);
        System.out.println("Enter side of square: ");
        double s = sc.nextDouble();
        a.area(s, s, s);
    }
}