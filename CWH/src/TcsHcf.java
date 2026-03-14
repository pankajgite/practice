import java.util.Scanner;

public class TcsHcf {
    public static int getHcf(int n, int m){
        if(n==0){
            return m;
        }
        else if(m==0){
            return n;
        }
        else if(n==m){
            return n;
        }
        else if(n>m){
            return getHcf(n-m, m);
        }
        else{
            return getHcf(m-n, n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int m = sc.nextInt();
        System.out.println(getHcf(n,m));
    }
}
