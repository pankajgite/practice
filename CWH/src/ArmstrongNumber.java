public class ArmstrongNumber {
    public static  boolean isArmstrong(int n) {
        int y=n;
        int sum =0;
        int len=String.valueOf(n).length();
        while(y!=0){
            int pop = y%10;
            sum= (int) (sum + Math.pow(pop, len));
            y=y/10;

        }
        return sum==n;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
