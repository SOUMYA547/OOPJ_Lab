interface Motor {
    int capacity = 10;

    void run();

    void consume();
}

class WashingMachine implements Motor {
    @Override
    public void run() {
    }

    @Override
    public void consume() {
    }
}

public class code2 {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        System.out.println("Capacity of the motor is " + washingMachine.capacity);
    }
}
