
import java.util.Scanner;

public class TcsReverseANum {
    public static int reversNum(int n){//231
        int rev =0;
        while(n>0){
            rev=rev*10;
            rev = rev+n%10;
            n=n/10; 
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to revers:");
        int n = sc.nextInt();

        System.out.println(reversNum(n));


    }
}
