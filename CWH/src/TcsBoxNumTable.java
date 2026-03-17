
import java.util.Scanner;

public class TcsBoxNumTable {
    public static void main(String[] args) {
        /*
        
        Q14: C program to Print Box Number Pattern of 1 and O
        Input: Given a single line input separated by space. N1 denotes the numbers of rows N2 denotes the number of columns.
        Output: Print the output in the required format.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];

        for(int i=0;i<row; i++){
            for(int j=0; j<col; j++){
                if(i==row-1 || j==col-1 || i==0 || j==0){
                    mat[i][j]=1;
                }
            }
        }
        for(int r= 0;r<row;r++){
            for(int q=0; q<col;q++){
                System.out.print(mat[r][q]+" ");
            }
            System.out.println();
        }
    }
}
