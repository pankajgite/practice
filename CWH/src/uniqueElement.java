public class uniqueElement {
    public static  int findUnique(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=count^nums[i];
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={2,3,4,2,3};
        System.out.println(findUnique(nums));
    }
}
