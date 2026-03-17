import java.util.Scanner;

public class TcsNoOfDayMonth {
    public static int getMonths(int month,int year){
        int[] monthDay = {31,28,31,30,31,30,31,31,30,31,30,31 };
        
        if(month>12){
            System.out.println("Month not matched");
            return -1;
        }
        if(month ==2){
            if((year%4==0 && year%100!=0) || (year%400 ==0)){
                return 29;
            }
            
        }
        
        return monthDay[month-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date: ");
        String date = sc.nextLine().trim();
        String[] arrdate = date.split("-");
        int month = Integer.parseInt(arrdate[1]);
        int year = Integer.parseInt(arrdate[2]);
        System.out.println("Month: "+month+" Year: "+year);
        System.out.println(getMonths(month,year));
    }
}
