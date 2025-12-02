import java.util.Arrays;

public class S1L6p3 {
    public static  int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxLen=0,left=0;
        long currentsum=0;
        for(int right=0;right<nums.length;right++){
            currentsum += nums[right];
            while((long)nums[right]*(right-left+1)>currentsum+k){
                currentsum -= nums[left];
                left++;
            
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        


        return maxLen;
    }
    public static void main(String[] args) {
        // nums = [1,2,4], k = 5
        // Output: 3
        // Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
        // 4 has a frequency of 3.

        // 1838. Frequency of the Most Frequent Element
        // Medium
        // Topics
        // premium lock icon
        // Companies
        // Hint
        // The frequency of an element is the number of times it occurs in an array.

        // You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.

        // Return the maximum possible frequency of an element after performing at most k operations.

        

        // Example 1:

        // Input: nums = [1,2,4], k = 5
        // Output: 3
        // Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
        // 4 has a frequency of 3.
        // Example 2:

        // Input: nums = [1,4,8,13], k = 5
        // Output: 2
        // Explanation: There are multiple optimal solutions:
        // - Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
        // - Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
        // - Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.
        // Example 3:

        // Input: nums = [3,9,6], k = 2
        // Output: 1
        

        // Constraints:

        // 1 <= nums.length <= 105
        // 1 <= nums[i] <= 105
        // 1 <= k <= 105
        
        int[] nums = {3,9,6};
        int k = 5;
        System.out.println(maxFrequency(nums, k));

    }
}
