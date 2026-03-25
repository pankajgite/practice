
import java.util.Scanner;

public class Tcs21Shift1q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int end = sc.nextInt();
        int[][] dp = new int[n+1][r+1];
        dp[1][1]=1;
        for(int i=2; i<=n;i++){
            int total =0 ;
            for(int j=1;j<=r;j++){
                total+=dp[i-1][j];
            }

            for(int j=0;j<=r;j++){
                dp[i][j]=total-dp[i-1][j];
            }
        }
        System.out.println(dp[n][r]);

    }
}
