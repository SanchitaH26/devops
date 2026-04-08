public class MainApp {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        // Perform operations
        int addResult = cal.add(2, 3);
        int subResult = cal.subtract(5, 2);
        int mulResult = cal.multiply(4, 5);
        int divResult = cal.divide(10, 2);

        // Display results
        System.out.println("Addition: 2 + 3 = " + addResult);
        System.out.println("Subtraction: 5 - 2 = " + subResult);
        System.out.println("Multiplication: 4 * 5 = " + mulResult);
        System.out.println("Division: 10 / 2 = " + divResult);

        // Division by zero (handled safely)
        try {
            cal.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
