
import java.util.Scanner;

public class TcsPrimeQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        if(n<1){
           System.out.println("Not Prime");
           return;
        }
        boolean prime = true;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        System.out.println(prime ? "Prime" : "Not Prime");
    }
}
