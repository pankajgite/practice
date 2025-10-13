
import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num =  sc.nextInt();
        boolean check=am(num);
        System.out.println(check);
        

    }

    public static boolean am(int num){
        int value=num;
        int count = count(num);
        int sum=0;
        while(num>0){
            int ab=num%10;
            sum=(int) (sum+ Math.pow(ab, count));
            num=num/10;
        }

        if(value==sum){
            return true;
        }else{
            return false;
        }
        
    }
    public static int count(int num){
        int n=0;

        while(num>0){
            int ab=num%10;
            n++;
            num=num/10;
        }
        return n;
    }
}
