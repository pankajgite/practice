import java.util.Arrays;

public class maxSubArray {
    public static  int maxSubArraysum(int[] nums) {
        //Using Kadane's Algorithm
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

    public static  int[] maxSubArray(int[] nums) {
        //Using Kadane's Algorithm
        int sum=0;
        int start=0;
        int end=0;
        int maxsum=nums[0];
        for(int i=0;i<nums.length;i++){

            if(sum==0){
                start=i;
            }
            sum=sum+nums[i];
            if(sum>maxsum){
                maxsum=sum;
                end=i;
            }
            if(sum<0){
                sum=0;
                
            }
        }
        int[] newarr= new int[(end+1-start)];
        sum=0;
        for(int i=start;i<end+1;i++){
            newarr[sum]=nums[i];
            sum++;
        }
        return newarr;
    }

    public static void main(String[] args) {
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubArraysum(nums));
        System.out.println(Arrays.toString(maxSubArray(nums)));


    }
}
