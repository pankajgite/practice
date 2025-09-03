import java.util.Scanner;


public class CBSE {
    public static void main(String[] args) {
        System.out.println("Welcome to CBSE marks to % Converter");
        System.out.println("====================================================");
        System.out.print("Enter Total Number of Subjects:");
        Scanner sc= new Scanner(System.in);
        int totalSub = sc.nextInt();
        float obt=0;
        float total=0;
        for (int i=0; i<totalSub;i++){
            System.out.print("Enter Marks obtained in Subject "+(i+1)+":");
            obt += sc.nextInt();
            System.out.print("Enter Total Marks in Subject "+(i+1)+":");
            total+=sc.nextInt();
        }
        float percentage = (obt/total)*100;
        System.out.println("====================================================");
        System.out.println("Final Percentage is: "+ percentage+"%");
        System.out.println("====================================================");
    }
}