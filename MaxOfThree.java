public class MaxOfThree {

    // Method to find maximum of three numbers
    public int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    // Main method (for demo)
    public static void main(String[] args) {

        MaxOfThree obj = new MaxOfThree();

        int result1 = obj.findMax(10, 20, 15);
        int result2 = obj.findMax(5, 3, 8);

        System.out.println("Max of (10, 20, 15): " + result1);
        System.out.println("Max of (5, 3, 8): " + result2);
    }
}
