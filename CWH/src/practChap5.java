
import java.util.Scanner;

public class practChap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num= sc.nextInt();
        // for (int i = 0; i < num; i++) {
        //     for (int j = 0; j < (num-i); j++) {
        //         System.out.print("*");
        //     }
            
        //     System.out.println();
        // }

//         Wirte a program to sum first n even numbers
// using while looф
    //     int count=1;
    //     int sum=0;
    //     while (count<num) { 
    //         if(count%2==0){
    //             sum+=count;
    //         }
    //         // System.out.println(count);
    //         count++;
    //     }
    //     System.out.println(sum);

    // ==================

    // Write a program to print mulbiplication table of
    // a given number n
    // for(int i =1;i<11;i++){
    //     System.out.println(i+" X "+num+" = "+i*num);
    // }

    // Print multiplication table in reverse order 
    // for (int i = 10; i >0; i--) {
    //     System.out.println(i+" X "+num+" = "+i*num);
    // }
    //=================================================================================

    //Factors of given numbers 
    // for(int i=2;i<=num;i++){
    //     while(num%i==0){
    //         num=num/i;
    //         System.out.print(i+", ");
    //     }
    //     if(num==1){
    //         break;
    //     }
    // }
    //factorial of a numbers 
    int fac=1;
    for(int i=1;i<=num;i++){
        fac*=i;
    }
    System.out.println(fac);
//==============================================================
// Write a program to calculate the sum of the
// numbers oxcuring in the muliplication table of 8=440
    // int sum=0;
    //     for(int i=1;i<11;i++){
    //         sum=sum+(i*num);
    //     }
    // System.out.println(sum);
    }
}
