import java.util.Arrays;

public class TcsCheckSumPair {
    public static boolean checksum(int sum , int n, int[] arr){

        // for(int i=0;i<n;i++){
        //     for(int j=0; j<n;j++){
        //         if(i!=j){
        //             if(sum == arr[i]+arr[j]){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;

        Arrays.sort(arr);
        int l=0;
        int r=n-1;
        while(l<r){
            int test = arr[l]+arr[r];
            if(test==sum){
                return true;
            }else if(test<sum){
                l++;
            }else{
                r--;
            }
        }
        return false;


    }
    public static void main(String[] args) {
        int sum =0;
        int[] arr = {-3, 1, 2, 3};
        int n = arr.length;
        
        if(checksum(sum, n, arr)){
            System.out.println("Array Has Two Elements with Given Sum");
        }else{
            System.out.println("No Array Do not have two elements with given Sum");
        }
    }
}
