
public class code2 {
    public static void main(String[] args) {
        int a = 50, b = 7;
        
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        } finally {
            System.out.println("Execution completed in finally block.");
        }
    }
}