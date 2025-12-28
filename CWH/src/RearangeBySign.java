import java.util.ArrayList;
import java.util.Arrays;

public class RearangeBySign {
    public static  int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();
        
       
        int posc=0;
        int negc=0;
        int[] new1 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos.add(nums[i]);
                posc++;
            }else{
                neg.add(nums[i]);
                negc++;

            }
        }
        int p=0;
        int n=0;
        for(int i=0;i<Math.min(posc, negc)*2;i++){
            if(i%2==1){
                new1[i]=neg.get(n);
                n++;
            }else{
                new1[i]=pos.get(p);
                p++;
            }
        }
        for(int i =Math.min(posc, negc)*2;i<nums.length;i++){
            if(posc>negc){
                new1[i]=pos.get(p);
                p++;
            }else{
                 new1[i]=neg.get(n);
                n++;
            }
        }
        return new1;
    }

    
    public static void main(String[] args) {
        int[] nums={-1,2,3,4,-3,1};
        System.out.print(Arrays.toString(rearrangeArray(nums)));
    }
}
