import java.util.Arrays;

public class LongestConsicutiveSeq {
    public static int longestConsecutive(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int count=1;
        int max=0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1){
                System.out.println("Updateing ");
                count++;
            } else if(nums[i+1]==nums[i]){
                continue;
            } else{
                System.out.println("in else");
                max=Math.max(max,count);
                count=1;
            }
            System.out.println("Max for "+i+" is "+max);
        }

        return Math.max(max, count);
    }
    public static void main(String[] args) {
        int[] nums= {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
