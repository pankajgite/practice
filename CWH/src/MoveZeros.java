import java.util.Arrays;

public class MoveZeros {
    public static  void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        for(int i=count;i<nums.length;i++){
            nums[i]=0;
        }
       
       
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
