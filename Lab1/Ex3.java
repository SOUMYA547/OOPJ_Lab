package Lab;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day number of the current month: ");

        int dayNumber = scanner.nextInt();

        scanner.close();

        String weekday;
        switch (dayNumber) {
            case 1:
                weekday = "Sunday";
                break;
            case 2:
                weekday = "Monday";
                break;
            case 3:
                weekday = "Tuesday";
                break;
            case 4:
                weekday = "Wednesday";
                break;
            case 5:
                weekday = "Thursday";
                break;
            case 6:
                weekday = "Friday";
                break;
            case 7:
                weekday = "Saturday";
                break;
            default:
                weekday = "Invalid day number";
                break;
        }

        System.out.println("Weekday: " + weekday);
    }
}
