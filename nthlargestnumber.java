import java.util.Arrays;

 class NthLargest {
    public static void main(String[] args) {
        int[] arr = {14, 67, 48, 23, 5, 62};
        int n = 4;

        // Check if n is within the bounds of the array
        if (n > arr.length) {
            System.out.println("Error: n is larger than the array length");
        } else {
            // Sort the array in descending order
            Arrays.sort(arr);
            int nthLargest = arr[arr.length - n];

            // Print the nth largest number
            System.out.println(n + "th largest number: " + nthLargest);
        }
    }
}