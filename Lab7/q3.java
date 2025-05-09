import java.io.*;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the source file name: ");
        String sourceFile = sc.nextLine();
        System.out.print("Enter the destination file name: ");
        String destFile = sc.nextLine();

        try (FileReader fr = new FileReader(sourceFile);
             FileWriter fw = new FileWriter(destFile)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("File copied using character stream.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
