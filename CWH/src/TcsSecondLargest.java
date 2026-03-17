
import java.util.Scanner;

public class TcsSecondLargest {
    public static int getSecondLargest(int[] arr){
        
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secLargest && arr[i]!=largest){
                secLargest = arr[i];
            }
        }
        if(secLargest == Integer.MIN_VALUE){
            System.out.println("No second Largest Element");
            return -1;
        }else{
            return secLargest;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine().trim();
        String[] stArr = st.split(",");
        int[] arr = new int[stArr.length];
        for(int i=0;i<stArr.length;i++){
            arr[i] = Integer.parseInt(stArr[i]);
        }

        System.out.println(getSecondLargest(arr));
    }
}
