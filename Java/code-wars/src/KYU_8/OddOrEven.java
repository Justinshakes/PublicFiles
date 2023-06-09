package KYU_8;

public class OddOrEven {
    public static String oddOrEven(int[] array) {
        int total = 0; // Initialize a variable to store the sum of the elements in the array

        for (int i : array) {
            total += i; // Add each element to the total
        }

        // Check if the total is divisible by 2 to determine if it's even or odd
        // If the remainder is 0, it's even. Otherwise, it's odd.
        return (total % 2 == 0) ? "even" : "odd";
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{2, 5, 34, 6})); // Example usage

        // Additional test cases
        System.out.println(oddOrEven(new int[]{})); // Output: "even"
        System.out.println(oddOrEven(new int[]{7})); // Output: "odd"
        System.out.println(oddOrEven(new int[]{2, 4, 6, 8})); // Output: "even"
        System.out.println(oddOrEven(new int[]{1, 3, 5, 7})); // Output: "odd"
        System.out.println(oddOrEven(new int[]{2, 3, 4, 5})); // Output: "even"
    }
}
