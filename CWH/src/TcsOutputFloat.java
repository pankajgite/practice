
import java.util.Scanner;

public class TcsOutputFloat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Float Number: ");
        double num = sc.nextDouble();
        System.out.printf("%.3f",num);

    }
}
