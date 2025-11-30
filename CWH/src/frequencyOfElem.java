
import java.util.HashMap;
import java.util.Scanner;

public class frequencyOfElem {
    public static void main(String[] args) {
        // Counting frequencies of array elements
        // inputs 
        // 5
        // 1 3 2 1 3
        // 5
        // 1 4 2 3 12 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arra1=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter elements of array"+i+":");
            arra1[i]=sc.nextInt();
        }
        
        System.out.println("Enter the querry array length:");
        int q = sc.nextInt();
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hash.containsKey(arra1[i])){
                hash.put(arra1[i], hash.get(arra1[i])+1);
            }else{
                hash.put(arra1[i], 1);
            }

        }
        int[] querry = new int[q];
        for(int i=0;i<q;i++){
            System.out.println("Enter elements of querry array"+i+":");
            querry[i]=sc.nextInt();
            System.out.println(hash.get(querry[i]));
            
        }
        System.out.println(hash);
       
        

        
    }
}
