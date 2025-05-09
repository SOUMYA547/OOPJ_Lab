package Lab;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();
        scanner.close();

        char grade;
        if (mark >= 90) {
            grade = 'O';
        } else if (mark >= 80) {
            grade = 'E';
        } else if (mark >= 70) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else {
            grade = 'C';
        }
        System.out.print("Grade: " + grade);
    }
}
