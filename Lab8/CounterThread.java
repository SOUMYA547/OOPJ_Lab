class CounterThread extends Thread {
    private int lower, upper;

    public CounterThread(String name, int lower, int upper) {
        super(name);
        this.lower = lower;
        this.upper = upper;
    }

    public void run() {
        System.out.println("Thread - " + getName());
        for (int i = lower; i <= upper; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        CounterThread thread = new CounterThread("First", 10, 15);
        thread.start();
    }
}
