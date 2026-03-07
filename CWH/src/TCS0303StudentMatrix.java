public class TCS0303StudentMatrix {
    public static  int studentPass(int N, int M, int[][] mat){
        int count=0;
        for (int i = 0; i < N; i++) {
            float temp=0;
            for (int j = 0; j < M; j++) {
                temp+=mat[i][j];
            }
            if(temp/M>50){
                count++;
            }
            
        }
        return count;
    }

    public static void main(String[] args) {
        int N=3;
        int M=3;
        int[][] mat = {{60,70,80},
                        {40,50,60},
                        {30,40,50}};
    

        System.out.println(studentPass(N, M, mat));
    }
}
