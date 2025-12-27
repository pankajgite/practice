public class maxSubArray {
    public static  int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>maxsum){
                maxsum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums={5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
}
