
public class sortedOrRotate {
    /**
     * Checks if the array was originally sorted in non-decreasing order, then rotated.
     * A sorted and rotated array will have at most one "break" point where
     * a number is smaller than the one preceding it.
     *
     * @param nums The input integer array.
     * @return true if the array is a sorted and rotated version, false otherwise.
     */
    public static boolean check(int[] nums) {//2, 1, 3, 4
        System.out.println("--- Starting check for array: " + java.util.Arrays.toString(nums) + " ---");
        int breaks = 0;
        int n = nums.length;
        System.out.println("Initial breaks: " + breaks);

        System.out.println("\n[Loop] Checking for breaks in the middle of the array...");
        for (int i = 1; i < n; i++) {
            System.out.print("i=" + i + ": Comparing nums[" + i + "](" + nums[i] + ") < nums[" + (i - 1) + "](" + nums[i-1] + ").");
            if (nums[i] < nums[i - 1]) {
                breaks++;
                System.out.println(" -> Found a break! Total breaks now: " + breaks);
            } else {
                System.out.println(" -> Order is OK.");
            }
        }

        // Check the wrap-around case (last element vs first element)
        System.out.println("\n[Wrap-around] Checking if last element nums[" + (n-1) + "](" + nums[n-1] + ") > first element nums[0](" + nums[0] + ").");
        if (n > 1 && nums[n - 1] > nums[0]) {
            breaks++;
            System.out.println(" -> Found a wrap-around break! Total breaks now: " + breaks);
        } else {
            System.out.println(" -> No wrap-around break.");
        }

        // A valid sorted and rotated array has at most one break.
        System.out.println("\nFinal check: Is total breaks (" + breaks + ") <= 1?");
        return breaks <= 1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4}; // Example 2: false
        System.out.print(check(nums));
    }
}
