import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
    public static  void nextPermutation(int[] nums) {
        List<Integer> li=new  ArrayList<>();
        int length =nums.length;
        int count=1;
        while (length>0) {
            count=count*length;
            length--;
        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
