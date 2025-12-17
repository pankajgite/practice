
public class MissingNumbers {
    public static int miss(int[] nums){
        int m= nums.length;
        int sum=(m*(m+1))/2;
        int current_sum=0;
        for(int i:nums){
            current_sum+=i;
        }
        return sum-current_sum;

    }
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(miss(nums));
    }
}
