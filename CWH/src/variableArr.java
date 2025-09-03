public class variableArr {
    static  int par(int ...arr){
        int sum=0;
        for(int i:arr){
            sum=sum+i;
        }
        return sum;

    }
    

    public static void main(String[] args) {
        System.out.println(par(2,54,6));
    }
}
