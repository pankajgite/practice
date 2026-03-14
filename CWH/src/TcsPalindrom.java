
import java.util.Scanner;

public class TcsPalindrom {
    public static boolean checkPalindromNum(int num) {
        int rev =0;
        int n=num;
        while(n>0){
            rev=rev*10;
            rev = rev+n%10;
            n=n/10; 
        }
        return rev==num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(checkPalindromNum(n));

    }
}
