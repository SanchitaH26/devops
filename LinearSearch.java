public class LinearSearch {

    // Method to perform linear search
    public int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index if found
            }
        }
        return -1; // not found
    }

    // Main method (for demo, no user input)
    public static void main(String[] args) {

        LinearSearch ls = new LinearSearch();

        int[] arr = {10, 20, 30, 40, 50};

        int result1 = ls.search(arr, 30);
        int result2 = ls.search(arr, 60);

        System.out.println("Search 30 → Index: " + result1);
        System.out.println("Search 60 → Index: " + result2);
    }
}
