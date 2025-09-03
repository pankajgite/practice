public class methods {
    static int logic(int a,int b){
        int sum=0;
        sum=a+b;
        return sum;

    }
    int logic2(int a,int b){
        int sum=0;
        if(a>b){
            sum=a-b;
        }
        else{
            sum=a+b;
        }
        
        return sum;

    }
    public static void main(String[] args) {
        int a=3 ;
        int b=2;
        System.out.println(logic(a,b));
        //method invocation using object creation 
        methods log= new methods();
        int c=log.logic2(a,b);
        System.out.println("logic 2:"+c);
        joke();
    }

    static void joke(){
        System.out.println("joke ");
    }
}
