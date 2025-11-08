public class finallyBlock {

    public static int greed(){
         try{
            int a = 6/0;
            return a;
        }catch(Exception e){
            System.out.println("Exception");
        }

        finally{
            System.out.println("Finally");
        }
        return 0;
    }
    public static void main(String[] args) {
       int k = greed();
       System.out.println(k);
    }
    
}
