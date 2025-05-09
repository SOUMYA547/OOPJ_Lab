import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElementOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list of numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] numbersArray = input.split(" ");

        Map<String, Integer> occurrences = new HashMap<>();

        for (String num : numbersArray) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            System.out.println("Occurrence of " + entry.getKey() + "=" + entry.getValue());
        }
    }
}
