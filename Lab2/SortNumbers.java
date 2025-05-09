import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the list of numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] numbersArray = input.split(" ");

        int[] numbers = Arrays.stream(numbersArray)
                               .mapToInt(Integer::parseInt)
                               .toArray();

        Arrays.sort(numbers);

        System.out.println("Numbers in ascending order: " + Arrays.toString(numbers));
    }
}
