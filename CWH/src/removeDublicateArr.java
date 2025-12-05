import java.util.Arrays;

public class removeDublicateArr {
    /**
     * Removes duplicates from a sorted array in-place.
     * @param nums The sorted integer array.
     * @return The number of unique elements (k).
     */
    public static int removeDuplicates(int[] nums) {
        // If the array is empty, there are no unique elements.
        if (nums.length == 0) {
            return 0;
        }

        // 'insertIndex' is the pointer for the next position to place a unique element.
        // It starts at 1 because the first element is always unique.
        int insertIndex = 1;

        // Iterate through the array starting from the second element.
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one, it's unique.
            if (nums[i] != nums[i - 1]) {
                // Place the unique element at the insertIndex and move the index forward.
                nums[insertIndex++] = nums[i];
            }
        }
        // The insertIndex now represents the count of unique elements.
        return insertIndex;
    }
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums);
        System.out.println("k:"+k);
        System.out.print(Arrays.toString(nums));
    }
}
