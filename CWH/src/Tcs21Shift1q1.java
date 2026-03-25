
import java.util.Scanner;

public class Tcs21Shift1q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int am=sc.nextInt();
        double topay;
        if(am>5000){
            topay = am - (am*15.0)/100;
            System.out.println(topay);
        }else if(am>1000){
            topay = am - (am*10.0)/100;
            System.out.println(topay);
        }else if(am>=0){
            topay = am- (am*5.0)/100;
            System.out.println(topay);
        }else{
            System.out.println("Error");
        }
    }
}
