
import java.util.Scanner;

public class Tcs2DArrayInp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row:");
        int row = sc.nextInt();//3
        System.out.println("Enter Column:");
        int col = sc.nextInt();//2
        sc.nextLine();
        System.out.println("Enter String ");
        String st = sc.nextLine();
        String[] stArr = st.split(",");
        int[][] allElmInt = new int[col][row];//3 2
        for(int i=0; i<col;i++){
            for(int j=0; j<row;j++){
                allElmInt[i][j]= Integer.parseInt(stArr[(i*row)+j]);
            }
        }

        for(int i=0; i<col;i++){
            for(int j=0; j<row;j++){
                System.out.print(allElmInt[i][j]+", ");
            }
            System.out.println();
        }
    


    }
}
