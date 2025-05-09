import java.util.Scanner;

class TwoD {
    double length;
    double width;

    TwoD(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class ThreeD extends TwoD {
    double height;

    ThreeD(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    double volume() {
        return length * width * height;
    }
}

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, width and height for the 3D box: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        ThreeD box = new ThreeD(length, width, height);
        System.out.println("Total cost of plastic: Rs " + (box.area() * 40 + box.volume() * 60));
    }
}