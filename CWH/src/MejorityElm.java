
import java.util.HashMap;
import java.util.Map;


public class MejorityElm {
    public static  int majorityElement(int[] nums) {
        
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>nums.length/2){
        //         return nums[i];
        //     }
        // }
        // return 0;

        HashMap<Integer,Integer> h2= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            try {
                int a=h2.get(nums[i])+1;
                h2.put(nums[i],a);
            } catch (Exception e) {
                h2.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: h2.entrySet()) {
            if(entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={2,2,1,3,1,1,4,1,1,5,1,1,6};//1,1,1,1,1,1,1,2,2,3,4,5,6
        System.out.println(majorityElement(nums));
    }
}
