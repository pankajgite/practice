import java.util.Scanner;

public class Tcs21shift2q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        if(n<0){
            System.out.println("Error");
        }else if(n>5){
            System.out.println(350+(n-5)*20);
        }else if(n>2){
            System.out.println(200+(n-2)*50);
        }else{
            System.out.println(n*100);
        }
        
    }
}
