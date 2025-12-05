import java.util.Arrays;

public class rightRotateN {
    /**
     * Rotates the array to the right by k steps in-place using the reversal algorithm.
     * This is an O(n) time complexity and O(1) space complexity solution.
     *
     * @param nums The array to rotate.
     * @param k The number of steps to rotate.
     */
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k % n == 0) {
            return; // No rotation needed if array is empty or k is a multiple of length
        }

        // Handle cases where k is larger than the array length
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }

    /**
     * Helper method to reverse a portion of an array in-place.
     */
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        System.out.print(Arrays.toString(nums));


    } 
}
