public class 8Inheritance {
    
class Superclass {
    static {
        System.out.println("Static block of Superclass");
    }

    {
        System.out.println("Instance initializer block of Superclass");
    }

    Superclass() {
        System.out.println("Constructor of Superclass");
    }
}

class Subclass extends Superclass {
    static {
        System.out.println("Static block of Subclass");
    }
    {
        System.out.println("Instance initializer block of Subclass");
    }
    Subclass() {
        System.out.println("Constructor of Subclass");
    }
}

public class InitializationDemo {
    public static void main(String[] args) {
        System.out.println("Creating the first Subclass object:");
        new Subclass();

        System.out.println("\nCreating the second Subclass object:");
        new Subclass();
    }
}

}
