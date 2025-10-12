
import java.util.Scanner;

public class HandelingExp {
    public static void main(String[] args) {
        // int[] arr= new int[3];
        int[] arr={12,44,65};
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Index You Want to Access: " );
        int num = sc.nextInt();

        System.out.print("Enter the number you want to divide : " );
        int ind = sc.nextInt();

        try {
            System.out.println("Index You requested is: "+arr[num]);
            System.out.println("Its division with the numeber is : "+arr[num]/ind);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something Went Wrong !!");
            System.out.println(e);
        }
        catch(ArithmeticException a){
            System.out.println("Arithmatic error "+a );
        }


    }
}
