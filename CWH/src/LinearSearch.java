public class LinearSearch {
    public static  int linearSearch(int nums[], int target) {
		for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2, -4, 4, 0, 10};
        int target = 6;
        System.out.println(linearSearch(nums, target));
    }
}
