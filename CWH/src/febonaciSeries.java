public class febonaciSeries {
    
    static public int fib(int n) {
        int sum=0;
        if(n>1){
            sum= fib(n-1)+fib(n-2);
            
        }else if(n==1){
            sum=sum+1;
        }
        else{
            sum = sum +0;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
