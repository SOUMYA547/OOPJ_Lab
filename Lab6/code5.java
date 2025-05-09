class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class code5 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Less than 4 arguments provided");
            }
            int sum = 0;
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                sum += (num * num);
            }
            System.out.println("Sum of squares: " + sum);
        } catch (CheckArgument e) {
            System.out.println("Exception occurred - " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter only integers.");
        }
    }
}
