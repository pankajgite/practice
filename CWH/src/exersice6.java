import java.util.Scanner;
class wrongOperatorException extends Exception{
    @Override
    public String toString(){
        return super.toString()+ "Wrong Operator used";
    }

    @Override
    public String getMessage(){
        return  super.getMessage()+ "Wrong Operator used";
    }
}

class divideByZero extends Exception{
    @Override
    public String toString(){
        return super.toString()+ "Cannot be divided By Zero!!";
    }

    @Override
    public String getMessage(){
        return  super.getMessage()+ "Cant Divide the number by Zero";
    }
}

class maxInputException extends Exception{
    public maxInputException(String message){
        super(message);
    }
}



public class exersice6 {
    
    public static double   calculator() throws wrongOperatorException, divideByZero, maxInputException {
        System.out.println("Welcome to Advance Calculator!!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        double a  = sc.nextDouble();

        System.out.print("Enter the operation you Want to perform: ");
        char op = sc.next().charAt(0);
        
        System.out.print("Enter Second number: ");
        double b  = sc.nextDouble();

        if(a>100000 || b>100000){
            throw new maxInputException("You Cannot enter this big number");
        }

        double result;

        switch (op) {
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                if(a>7000 || b>7000){
                    throw new maxInputException("For Multiplication you Cannot enter this big values!! value must be less than 7000");
                }else{
                    result = a*b;
                }
                break;
            case '/':
                if(a==0 || b==0){
                    throw  new divideByZero();
                }
                try{
                    result = a/b;
                }catch(Exception e){
                    throw new divideByZero();
                }
                break;
            default:
                throw new wrongOperatorException();
        }

        return result;

        
    }
    public static void main(String[] args) throws wrongOperatorException, divideByZero, maxInputException {
        // Exercise 6: You have to create a custom calculator with following operations:
        // 1. + -> Addition
        // 2. - -> Subtraction
        // 3. * -> Multiplication
        // 4. / -> Division

        // which throws the following exceptions:
        // 1. Invalid input Exception ex: 8 & 9
        // 2. Cannot divide by 0 Exception
        // 3. Max Input Exception if any of the inputs is greater than 100000
        // 4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
        double a=calculator();
        System.out.println(a);
    }
}
