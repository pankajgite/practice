import java.util.Scanner;

public class TcsInputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number String");
        String input = sc.nextLine().trim();
        input = input.replaceAll("\\[|\\]", "");
        String[] parts = input.split(",");
        int[] stArray = new int[parts.length];
        for(int i=0; i< parts.length; i++){
            stArray[i] = Integer.parseInt(parts[i]);
        }
        

        for(int i=0; i<stArray.length; i++){
            System.out.println(stArray[i]);
        }
    }
}
