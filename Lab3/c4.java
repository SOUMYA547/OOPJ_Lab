import java.util.*;

class Subtract {
    void subtract(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }

    void subtract(double a, double b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }

    void subtract(int a, double b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }

    void subtract(double a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }
}

class c4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Subtract s = new Subtract();
        System.out.println("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        s.subtract(a, b);
        System.out.println("Enter two doubles: ");
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        s.subtract(c, d);
        System.out.println("Enter an integer and a double: ");
        int e = sc.nextInt();
        double f = sc.nextDouble();
        s.subtract(e, f);
        System.out.println("Enter a double and an integer: ");
        double g = sc.nextDouble();
        int h = sc.nextInt();
        s.subtract(g, h);
    }
}