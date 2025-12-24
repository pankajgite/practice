public class maxSubArray {
    public static  int maxSubArray(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                count=count+nums[j];
                if(count>sum){
                    sum=count;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums={1};
        System.out.println(maxSubArray(nums));
    }
}
