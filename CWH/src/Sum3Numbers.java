import java.util.Scanner;

public class Sum3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of numbers you want to sum:");
        int no = sc.nextInt();
        float total=0;
        for(int i=0; i<no; i++){
            System.out.print("Enter  number "+(i+1)+": ");
            total+= sc.nextFloat();
        }
        System.out.println("Final Sum of given numbers is : "+total);
    }
}
