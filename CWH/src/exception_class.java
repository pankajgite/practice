
import java.util.Scanner;

class Myexeption extends Exception{
    @Override
    public String toString(){
        return super.toString() + "I am to String  toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+ " I am get Message()";
    }

    
}

public class exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number.");
        a=sc.nextInt();
        if(a<9){
            try {
                throw  new ArithmeticException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }

           
        }
    }
}
