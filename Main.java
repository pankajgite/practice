import java.util.*;
public class Main{
	public static void main(String[] arg){
		int[] arr = {100,200,300,400};
		int k = 2;
		System.out.println(maxSubarraySum(arr,k));
	}
	public static int maxSubarraySum(int[] arr, int k){
		int r=0;
		int l=0;
		int max=Integer.MIN_VALUE;
		int sum=0;
		while(r<arr.length){
			sum = sum + arr[r];
			if(r-l+1 == k){
				max = Math.max(max,sum);
				sum = sum - arr[l];
				l++;
				
			}
			r++;
			
		}

		return max;
	}
}