import java.util.*;

class plate {
    int length, width;

    plate(int l, int w) {
        length = l;
        width = w;
        System.out.println("Dimensions of the plate \nLength : " + length + " Width : " + width);
    }
}

class box extends
        plate {
    int height;

    box(int l, int w, int h) {
        super(l, w);
        height = h;
        System.out.println("Dimensions of the box \nLength : " + length + " Width : " + width + " Height : " + height);
    }
}

class woodbox extends box {
    int thick;

    woodbox(int l, int w, int h, int t) {
        super(l, w, h);
        thick = t;
        System.out.println("Dimensions of the wood box \nLength : " + length + " Width : " + width + " Height : "
                + height + " Thickness : " + thick);
    }
}

class ex2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of plate");
        System.out.print("Enter lenght :");
        int l = sc.nextInt();
        System.out.print("Enter width :");
        int w = sc.nextInt();
        System.out.println("Enter the dimensions of box");
        System.out.print("Enter height :");
        int h = sc.nextInt();
        System.out.println("Enter the dimensions of wood box");
        System.out.print("Enter thickness :");
        int t = sc.nextInt();
        woodbox wb = new woodbox(l, w, h, t);
    }
}