class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class code3 {
    public void ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number should be positive");
        } else {
            System.out.println("Double value: " + (number * 2));
        }
    }

    public static void main(String[] args) {
        code3 example = new code3();
        try {
            System.out.print("Enter a number: ");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int number = scanner.nextInt();
            example.ProcessInput(number);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
