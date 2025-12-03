import java.util.Arrays;

public class SelectionSort {
    // Renamed method to follow Java's camelCase convention.
    // The method now modifies the array in-place, so it doesn't need to return it.
    public static void selectionSort(int[] arr){
        // The outer loop needs to go up to arr.length - 1.
        for(int i=0;i<arr.length-1;i++){
            // We only need to keep track of the index of the minimum element.
            int min_index = i;
            for(int j=i+1;j<arr.length;j++){
                // Compare with the element at the current min_index.
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part.
            int tmp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=tmp;
        }
    }

    public static void bubleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tem =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                    swapped=true;
                }

            }
            if(swapped==false){
                break;
            }
            
        }
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {  
            int j=i;                            
            while(j>0 && arr[j-1]>arr[j]){      
                int tmp=arr[j];                 
                arr[j]=arr[j-1];                
                arr[j-1]=tmp;                   
                j--;                            
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {14,9,15,12,6,8,13};
        System.out.print("Before Sorting: " );
        // Using Arrays.toString() for a cleaner way to print the array.
        System.out.println(Arrays.toString(arr1));

        insertionSort(arr1);
        System.out.println();
        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr1));

    }
}
