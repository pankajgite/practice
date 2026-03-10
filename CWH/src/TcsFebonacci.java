
import java.util.Scanner;

public class TcsFebonacci {
    public static void printFeboNnumbers(int n){
        if(n<0){
            System.out.println("Wrong Input!!");
            return;
        }
        int a=0 , b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }

    public static int printNthNumber(int n){
        if(n<0){
            System.out.println("Wrong Input!!");
            return -1;
        }
        if(n==0) return 0;
        if(n==1) return 1;

        int a=0,b=1;
        for(int i =2;i<=n;i++){
            int c =a+b;
            a=b;
            b=c;

        }
        return b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numeber");
        int n = sc.nextInt();
        printFeboNnumbers(n);
        System.out.println();
        System.out.println("Nth term: "+printNthNumber(n));

    }
}
