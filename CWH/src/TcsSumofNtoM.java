public class TcsSumofNtoM {
    public static int getAllSumm(int n,int m){
        int count = m-n+1;
        return count*(n+m)/2;
    }
    public static void main(String[] args) {
        int n=5;
        int m=5;
        System.out.println(getAllSumm(n,m));
    }
}
