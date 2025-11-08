public class forFinallayQuiz {
    public static void main(String[] args) {

        for(int i =0 ;i<10 ;i++){
            try{
                if(i==5){
                    System.out.println(i/0);
                }else{
                    System.out.println(i);
                }

            }catch(Exception e){
                System.out.println("Exception");
                break;
            }
            finally{
                System.out.println(i+"done");
            }
        }
        
    }
}
