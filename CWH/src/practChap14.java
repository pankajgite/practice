
import java.util.Scanner;

class maxRetrys extends Exception{
        @Override
        public String toString(){
            return super.toString() + "Max retry Reached Try Again Leter!";
        }

        @Override
        public String getMessage() {
            return super.getMessage()+ " Max retry reached try again after some time!";
        }

    
    }
    
public class practChap14 {
    
    
    public static void main(String[] args) throws maxRetrys {
        Scanner sc = new Scanner(System.in);
        
        //Question 1 Write a  program to demenstrate syntax, logical & runtime errors!
        // // syntax erorr 
        // int a=2

        // //logical
        // //accesing Age of a person
        // int birthYear=2002;
        // int currentYear=2025;
        // int age = currentYear + birthYear;

        // //run time
        // System.out.println(10/0);

        // // Question 2 White a Java program that prints "Halta" dwring
        // // Arithmetic eaception and " Hette" suring an Illdgal argument exception

        // try{
        //     int a=66/0;
        //     System.out.println(a);
        // }catch(ArithmeticException a){
        //     System.out.println("HAHA");
        // }catch(IllegalArgumentException i){
        //     System.out.println("HEE");
        // }

        // Question 3 Write s program that allous you to keep acessing
        // an array until a valid index is given If max
        // reties exced 5 prind "Error"
        int[] pan = {12,1,32,45,65};
        boolean flag = true;
        int i=0;
        while(flag){
            if(i>4){
                throw new maxRetrys();
            }
            try{
                System.out.println("Enter the Index you Want to Access!!");
                int m= sc.nextInt();
                System.out.println("value for the entered index is "+pan[m]);
                flag = false;
            }catch(Exception e){
                System.out.println("Error Ocuured Invalid index provided!!");
            }
            i++;
            
        }
        

        
    }
}
