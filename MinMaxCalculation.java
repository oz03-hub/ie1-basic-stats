import java.util.Arrays;

public class MinMaxCalculation {
    public static void main(String[] args) {
        // Sample set of numbers
        int[] numbers = {5, 2, 9, 1, 7, 6, 3};

        // Calculate minimum and maximum
        int min = findMin(numbers);
        int max = findMax(numbers);

        // Print results
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    // Method to find the minimum value
    public static int findMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    // Method to find the maximum value
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}