public class TcsPaper12 {
//  count Sub array with given sum 
    public static int getSubArraySum(int l , int sum, int[] arr){
        int count =0;
        for(int i=0; i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int sum =2;
        int l = arr.length;
        System.out.println(getSubArraySum(l, sum, arr));

    }
}
