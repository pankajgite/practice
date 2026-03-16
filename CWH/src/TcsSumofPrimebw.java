
import java.util.Scanner;

public class TcsSumofPrimebw {
    public static boolean findPrime(int n){
        if(n<=1){
            return false;
        }
        boolean prime =true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between which you want to check in space seprated form");
        String num = sc.nextLine().trim();
        String[] str = num.split(" ");
        int n1 = Integer.parseInt(str[0]);
        int n2 = Integer.parseInt(str[1]);
        int sum=0;

        for(int i=n1; i<n2; i++){
            if(findPrime(i)){
                // System.out.println("THis is Prime: "+i);
                sum+=i;
            }
        }

        System.out.println("Sum is: "+sum);
    }
}
