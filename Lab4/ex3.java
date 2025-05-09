import java.util.*;

class Apple {
    void show() {
        System.out.println("This is the Show function of Apple");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is the Show function of Banana");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is the Show function of Cherry");
    }
}

class ex3 {
    public static void main(String args[]) {
        Apple a = new Apple();
        a.show();
        Apple b = new Banana();
        b.show();
        Apple c = new Cherry(); 
        c.show();
    }
}