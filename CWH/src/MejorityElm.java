
public class MejorityElm {
    public static  int majorityElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/2){
                return nums[i];
            }
        }
        return 0;
        
    }
    public static void main(String[] args) {
        int[] nums={2,2,1,3,1,1,4,1,1,5,1,1,6};//1,1,1,1,1,1,1,2,2,3,4,5,6
        System.out.println(majorityElement(nums));
    }
}
