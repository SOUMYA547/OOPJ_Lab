import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public void setTime(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("Hours must be between 0 and 24.");
        }
        if (minutes < 0 || minutes >= 60) {
            throw new MinException("Minutes must be between 0 and 59.");
        }
        if (seconds < 0 || seconds >= 60) {
            throw new SecException("Seconds must be between 0 and 59.");
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void displayTime() {
        System.out.printf("Correct Time-> %02d:%02d:%02d\n", hours, minutes, seconds);
    }
}

public class code4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time time = new Time();

        try {
            System.out.print("Enter hours: ");
            int hours = scanner.nextInt();

            System.out.print("Enter minutes: ");
            int minutes = scanner.nextInt();

            System.out.print("Enter seconds: ");
            int seconds = scanner.nextInt();

            time.setTime(hours, minutes, seconds);
            time.displayTime();
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}