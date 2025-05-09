import java.util.*;

class box {
    double length, width, height;

    void volume() {
        double vol;
        vol = length * width * height;
        System.out.println("Volume of box is: " + vol);
    }
}

class c1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        box b = new box();
        System.out.println("Enter length, width and height of box: ");
        b.length = sc.nextDouble();
        b.width = sc.nextDouble();
        b.height = sc.nextDouble();
        b.volume();
    }
}