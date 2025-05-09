package Lab;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        String fullName = lastName + " " + firstName;
        System.out.println("Output: " + fullName);
    }
}
