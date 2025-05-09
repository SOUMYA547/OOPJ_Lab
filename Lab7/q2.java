import java.io.*;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        String rollNo = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();
        System.out.print("Enter Marks: ");
        String marks = sc.nextLine();

        System.out.print("Enter the filename to store details: ");
        String filename = sc.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(rollNo + "," + name + "," + subject + "," + marks);
            System.out.println("Student details saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("\nReading content from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
