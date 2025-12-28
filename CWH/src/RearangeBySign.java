import java.util.Arrays;

public class RearangeBySign {
    public static  int[] rearrangeArray(int[] nums) {
        
        int[] new1= new int[nums.length];
        int posc=0;
        int negc=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                new1[negc]=nums[i];
                negc=negc+2;
            }else{
                new1[posc]=nums[i];
                posc=posc+2;
            }

        }
        
        return new1;
    }

    
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        System.out.print(Arrays.toString(rearrangeArray(nums)));
    }
}
