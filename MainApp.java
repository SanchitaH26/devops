public class Calculator {

    // Methods
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Main method (execution starts here)
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println("Addition: " + cal.add(2, 3));
        System.out.println("Subtraction: " + cal.subtract(5, 2));
        System.out.println("Multiplication: " + cal.multiply(4, 5));
        System.out.println("Division: " + cal.divide(10, 2));

        // Handling exception
        try {
            cal.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
