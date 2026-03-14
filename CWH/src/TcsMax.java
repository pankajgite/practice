
import java.util.Scanner;

public class TcsMax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number of Elements:");
        int n = sc.nextInt();
        int max = -1020;
        for(int i=0;i<n;i++){
            System.out.println("Enter Element: ");
            int x = sc.nextInt();
            max = Math.max(max, x);
        }

        System.out.println("Maximum Element is: "+max);
    }
}
