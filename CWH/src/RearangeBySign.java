import java.util.Arrays;

public class RearangeBySign {
    public static  int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int[] new1= new int[nums.length];
        int posc=0;
        int negc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos[posc]=nums[i];
                posc++;
            }else{
                neg[negc]=nums[i];
                negc++;

            }
        }
        posc=0;
        negc=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==1){
                new1[i]=neg[negc];
                negc++;
            }else{
                new1[i]=pos[posc];
                posc++;
            }
        }
        return new1;
    }

    
    public static void main(String[] args) {
        int[] nums={-1,1};
        System.out.print(Arrays.toString(rearrangeArray(nums)));
    }
}
