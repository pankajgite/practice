public class tryCatch {
    public static void main(String[] args) {
        int a=9000;
        int b=0;
        try{
            int c=a/b;
            System.out.println("Result is:"+c);
        }
        catch(Exception e){
            System.out.println("cananot run the code due to this execption: ");
            System.out.println(e);
        }
        
    }
}
