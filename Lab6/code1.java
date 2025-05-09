import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[4];

        try {
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < 5; i++) {
                array[i] = scanner.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" " + e);
        }
    }
}

