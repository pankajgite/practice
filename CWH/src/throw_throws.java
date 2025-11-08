class NegativeExep extends Exception{
    @Override
    public String toString(){
        return super.toString() + "Redius canot be negative";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+ " Redius canot be negative !!";
    }

    
}


public class throw_throws {
    public static double area(int r) throws NegativeExep{
        if(r<0){
            throw new NegativeExep();
        }
        double result= Math.PI * r * r;
        return result; 
    }
    public static double  divide(int a, int b) throws ArithmeticException{
        double result = a/b;

        return result;
    }

    public static void main(String[] args) {

        try {
            double division = divide(6, 0);
            System.out.println(division);
            
        } catch (Exception e) {
            System.out.println("Exception");
        }

        try {
            double ar = area(6);
            System.out.println(ar);
        } catch (NegativeExep ex) {
            System.out.println(" Negative Exeption");
        }
        
        
    }
}
