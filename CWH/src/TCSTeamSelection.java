public class TCSTeamSelection {

    public static long  getTeams(int N, int R){
        if(R > N) return 0;

        R = Math.min(R, N - R);

        long result = 1;

        for(int i = 0; i < R; i++){
            result = result * (N - i);
            result = result / (i + 1);
        }

        return result;
    }


    public static void main(String[] args) {
        int N = 5;
        int R = 2;
        System.out.println(getTeams(N, R));
    }
}
