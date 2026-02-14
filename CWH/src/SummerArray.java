
import java.util.ArrayList;
import java.util.List;

public class SummerArray {

    public static int  getSummerArray(int[] arr,int n){
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        int ev=0,od=0;
        int min=0;
        for(int i =0;i<n;i++){
            if(arr[i]%2==0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        for(int i=0;i<even.size();i++){
            ev+=(even.get(i)-i);
            od+=(odd.get(i)-i);
        }




        return Math.min(ev, od);
    }
    public static void main(String[] args) {
        int[] arr= {2, 4, 1, 3, 5, 6};
        int n=arr.length;
        System.out.println(getSummerArray(arr, n));
    }
}
