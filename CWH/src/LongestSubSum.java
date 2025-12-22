public class LongestSubSum {
    public static int longestSubarray(int[] nums, int k) {
        int max=0;

        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    int curr=j-i+1;
                    if(max<curr){
                        max=curr;
                        break;
                    }
                }
                else if(sum>k){
                    break;
                }

            }
        }
       return max;
    }
    public static void main(String[] args) {
        int[] nums={10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(longestSubarray(nums, k));
        
    }
}
