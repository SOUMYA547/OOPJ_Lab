import java.util.*;

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println(
                "Area of rectangle with length " + length + " and breadth " + breadth + " is: " + (length * breadth));
    }
}

class c6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        r1.area();
        System.out.println("Enter length and breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle r2 = new Rectangle(l, b);
        r2.area();
    }
}