
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TcsPaper11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine().trim();
        String[] stArr = st.split(",");
        List<String> listSt = new ArrayList<>();
        for(String word:stArr){
            String wt = word.trim();
            if(!listSt.contains(wt)){
                listSt.add(wt);
            }
        }
        Collections.sort(listSt);
        printList(listSt);
        Collections.sort(listSt,Collections.reverseOrder());
        printList(listSt);
    }
    // Helper method to print in required format
    public static void printList(List<String> list) {
        int i = 0;
        int size = list.size();

        for (String word : list) {
            System.out.print(word);
            if (i < size - 1) {
                System.out.print(", ");
            }
            i++;
        }
        System.out.println();
    }
}
