
import java.util.Scanner;

public class Tcs20shift1q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        if(n<1){
            System.out.println("Error");
            return;
        }

        if(n%12==0){
            System.out.println((n/12)*15000);
        }else if(n%9==0){
            System.out.println((n/9)*1200);
        }else if(n%6==0){
            System.out.println((n/6)*9000);
        }else if(n%3==0){
            System.out.println((n/3)*5000);
        }else{
            System.out.println("Error");
        }

    }
}
