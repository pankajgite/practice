import java.util.Arrays;

public class NextPermutation {
    public static  void nextPermutation(int[] nums) {
        int i= nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;

        if(i>=0){
            int j= nums.length-1;
            while(i>=0 && nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }

        reverse(nums, i+1);
        
    }

    public static  void swap(int[] nums,int i , int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static  void reverse(int[] nums,int start){
        int end=nums.length-1;
        while(end>start){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1,1,5,4,6};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
