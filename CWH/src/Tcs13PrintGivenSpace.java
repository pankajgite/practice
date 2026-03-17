import java.util.Scanner;

public class Tcs13PrintGivenSpace {
    //Tcs13PrintGivenSpace.java
    //Print digits of a given number in same order
    //345533  3 4 5 5 3 3 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n =sc.nextInt();
        // List<Integer> l1 = new ArrayList<>();

        // while(n>0){
        //     l1.add(n%10);
        //     n/=10;
        // }
        // for(int i=l1.size()-1;i>=0;i--){
        //     System.out.print(l1.get(i)+" ");
        // }

        //option 2 
        int n = sc.nextInt();
        if(n<0){
            System.out.print("-");
            n=Math.abs(n);
        }
        if(n==0){
            System.out.print(0);
        }
        int divisor =1;

        while(n/divisor>=10){
            divisor*=10;
        }
        while(divisor>0){
            System.out.print((n/divisor)+" ");
            n = n%divisor;
            divisor/=10;
        }
        
    }
}
