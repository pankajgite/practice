import java.util.Scanner;

public class tryChatchQuick {
    public static void main(String[] args) {
        
        int[] arr = {34,45,24,55};
        
        //run(arr);
        kunal(arr);
        
        
    }

    public static void kunal(int[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter index Number");
        int a=sc.nextInt();

        if(a<0){
            System.out.println("Please enter Valid Index");
            kunal(arg);
        }else if (a<arg.length) {
            System.out.println("Element at given index is :"+arg[a]);
            kunal(arg);
        }else{
            System.out.println("Something Went Wrong!!");
        }

    }


    public static void run(int[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter index Number");
        int a=sc.nextInt();
        try {
            System.out.println("Element at this index"+arg[a]);
            run(arg);
        } catch (Exception e) {
            System.out.println("Something Went Wrong!!"+ e);
        }
    }
}
