
import java.util.Scanner;

public class practChap7{

    static void table(int num){
        for (int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+ num*i);
        }
    }

    static void pattern(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void patternUlta(int num){
        for (int i = 0; i < num; i++) {
            for (int j = num-i; j >0; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static int sumrec(int n){
        if(n<=1){
            return 1;
        }else{
            return n+sumrec(n-1);
        }
    }

    static int recurtion(int n){
        if(n==1){
            return 0;
        }if(n==2){
            return 1;
        }
        else{

        return recurtion(n-1)+recurtion(n-2);
        }
    }

    // recurtion(5) + recurtion(4)
    // recurtion (4) + recurtion (3)    +  recurtion (3)+ recurtion (2)
    // recurtion (3)+recurtion (2) + recurtion (2) + recurtion (1) recurtion (2) + recurtion (1)+ 1
    // recurtion (2) + recurtion (1) + 1    + 1     +0  +1
    // 1+0+3 =4 

    static double  avgArg(int ...arr){
        double length = arr.length;
        double  sum=0;
        for(int i:arr){
            sum+=i;
        }
        

        return sum/length;
    }

    static  int repeat(int number , int time){
        
        if(time==0){
            return 0;
        }
        else{
            System.out.println(number);
            return repeat(number, time-1);
        }
    }
    static double toFarenheit(double cel){

        return (cel*9/5) +32;
    }

    public static void main(String[] args) {
        //Methods practise set 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Question 1 Multiplication table
        // System.out.println("Muiltiplication Table of "+number+" is :");
        // table(number);

        // Question 2 patter 
        // System.out.println("Printing Pattern");
        // pattern(number);

        // Question 3 Write a recursive function to calculate sum of first n natural numbers
        // System.out.println("sum of "+ number +" is: "+sumrec(number));

        // Question4 Write a function to print the folbwing pattern
        // *****
        // ****
        // ***
        // **
        // *
        // System.out.println("Printing Ulta Pattern");
        // patternUlta(number);

        // Question 5 Write a function to print nith term of fibonacci seres using recursioh
        // System.out.println(recurtion(number));

        //Question 6 Write a function to find arerage of set of numbers passed as arguments
        // System.out.println("Average of the numbers passed:"+avgArg(22,12,24));

        // Question 7 Repeat 4 using recursion
        //Question 8 Repeat 2 using recursion
        // repeat(number, 5);

        //Question 9 Write a function to convent Calsius temperativeeinto fahcenkeit
        System.out.println(toFarenheit(53));
        
    }
}