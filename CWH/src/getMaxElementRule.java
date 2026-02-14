public class getMaxElementRule {

    public static int getMax(int num){
        int[] arr= new int[num+1];
        int max=1;
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<num+1;i++){
            if(i%2==0){
                arr[i]=arr[i/2];
            }else{
                arr[i]=arr[i/2]+arr[i/2+1];
            }
            max=Math.max(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int num=7;
        System.out.println(getMax(num));
    }
}
