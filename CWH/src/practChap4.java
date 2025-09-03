
import java.util.Scanner;

public class practChap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q1 it will give error 

        //Q2
        // Write a program to find out whether a Student
        // is pass or fail; if it requires total 40%. and I at least 33% in each subijet to pass
        // Assume 3 Subject and take marks as an input
        // from the user.

        // System.out.println("Enter marks in %");
        // int total=0;
        // for(int i=0;i<3;i++){
        //     int marks=0;
        //     System.out.printf("Enter marks of Subject %d in %% :",i+1);
        //     marks = sc.nextInt();
        //     if (marks <=33){
        //         System.out.printf("You are failed in Subject %d .",i+1);
        //         break;
        //     }
        //     total+=marks;

        // }
        // if((total/3)>40){
        //     System.out.println("Pass");
        // }
        // else{
        //     System.out.println("Fail");
        // }

        // Q3 Calculate income tax paid by an employee to the Government as per the slabs mentioned below 
        // Income Slal Tax
        // 2.5L-5-0L 5%
        // 5.01-1001 20%
        // Above 10.01 30%
        // Note that there is no tax below 2-51. Take imputamount as an input from the uiser.
        // System.out.print("Enter ur income Amount:");
        // int govamt=0;
        // int amount = sc.nextInt();
        // if(amount>=250000 && amount<=500000){
        //     System.out.println("You are under 5% tax slab");
        //     govamt = (amount*5)/100;
        // }
        // else if(amount>500000 && amount<=1000000){
        //     System.out.println("You are under 20% tax slab");
        //     govamt = (amount*20)/100;
        // }
        // else if(amount>1000000){
        //     System.out.println("You are under 30% tax slab");
        //     govamt = (amount*30)/100;
        // }
        // else{
        //     System.out.println("You not under tax slab");
           
        // }
        // System.out.println("Income Tax paid to government is :"+govamt);
        //====================================================================
        //Q4 White va Sava program to find out the say of the week giren the number [ 1 for Mondary 2 for Tusday . and on 50 on!1
        // System.out.print("Enter the day number:");
        // int number = sc.nextInt();
        // switch (number) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thusday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Not a valid week number");
        //         break;
        // }
        //========================================================== 
        // Q5Write a JaNa program to find whether a year
        // entered by the iser is a leap year or not.
        // System.out.print("Enter the Year:");
        // int Year=sc.nextInt();
        // if(Year%4==0){
        //     System.out.println("This is the Leep Year");
        // }
        // else{
        //     System.out.println("Not an leep Year");
        // }
        // ===================================================
        //Q6 Write a program to find out the type of welvsite from the Url
        // •Com Commertial website
        // .org organigation website 
        //.in indian website 
        System.out.print("Enter Url:");
        String url= sc.nextLine();
        int doti = url.indexOf(".");
        // System.out.println(doti);
        String afterdot= url.substring(doti);
        System.out.println(afterdot);
        switch (afterdot){
            case ".in":
                System.out.println("Indian website");
                break;
            case ".com":
                System.out.println("Commertial website");
                break;
            case ".org":
                System.out.println("Organization Website");
                break;
            default:
                System.out.println("other Website");
                
        }
    }
}
