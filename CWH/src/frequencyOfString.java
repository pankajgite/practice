
import java.util.Scanner;

public class frequencyOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        
        int[] hash = new int[26];
        for(int i=0;i<str.length();i++){
            hash[str.charAt(i)-'a']++;
        }
        
        System.out.println("Enter the querry string length:");
        int q = sc.nextInt();
        char[] querry = new char[q];
        for(int i=0;i<q;i++){
            System.out.println("Enter elements of querry array"+i+":");
            querry[i]=sc.next().charAt(0);
            System.out.println(hash[querry[i]-'a']);
        }
    }
}
