public class MaxConsiqutiveOne {
    public static  int findMaxConsecutiveOnes(int[] nums) {
        int cur=0;
        int max=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                if(cur>max){
                    max=cur;
                }
                cur=0;
            }else{
                cur++;
            }
            System.out.println("1Current: "+cur+" Max: "+max);
        }
        System.out.println("Current: "+cur+" Max: "+max);
        if(cur>max){
            max=cur;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
