import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class MonsterGame {
    static class Monster{
        int power;
        int bonus;

        public Monster(int power, int bonus) {
            this.power=power;
            this.bonus=bonus;
        }
        
    }
    public static Integer War(int n, int intialExp,int[] monst,int[] bonus) {
        Monster[] monsters = new Monster[n];
        for (int i=0;i<n;i++) {
            monsters[i]= new Monster(monst[i],bonus[i]);
        }
        Arrays.sort(monsters,Comparator.comparingInt(m->m.power));
        int defete=0;
        int intitialxp=intialExp;
        for (Monster m: monsters) {
            if(intitialxp>=m.power){
                intitialxp+=m.bonus;
                defete++;

            }else{
                break;
            }
        }

        return defete;
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int exp = s.nextInt();

        int[] monst = new int[n];
        int[] bonus = new int[n];

        for (int i = 0; i < n; i++) monst[i] = s.nextInt();
        for (int i = 0; i < n; i++) bonus[i] = s.nextInt();
        System.out.println("you defeted :"+War(n, exp, monst, bonus));
        
    }
}
