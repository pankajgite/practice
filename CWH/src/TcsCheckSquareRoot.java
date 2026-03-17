
import java.util.Scanner;

public class TcsCheckSquareRoot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Failure");
            return;
        }
        int a = (int) Math.sqrt(n);
        if(a*a==n){
            System.out.println("Success");
        }else{
            System.out.println("Failure");
        }
    }
}
