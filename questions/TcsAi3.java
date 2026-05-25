import java.util.*;
class TcsAi3{

	public static int rob(int[] arr, int start, int end){

		int prev2 = 0;
		int prev1 = 0;
		
		for(int i=start;i<=end;i++){
			int pick = arr[i] + prev2;
			int notPick = prev1;

			int curr = Math.max(pick,notPick);

			prev2 = prev1;
			prev1 = curr;
		}
		return prev1;

	}


	public static void main(String[] args1){
		Scanner sc=  new Scanner(System.in);
		int m = sc.nextInt();
		int n =  sc.nextInt();

		int[] arr = new int[n+1]; 
		for(int i=0;i<=n;i++){
			arr[i] = i*i;
		}
		if(n==0){
			System.out.println(0);
			return;

		}


		if(n==1){
			System.out.println(1);
			return;

		}

		int case1  = rob(arr,0,n-1);

		int case2 = rob(arr,1,n);

		int ans  = Math.max(case1, case2);
		System.out.println(ans);
		sc.close();

	}
}