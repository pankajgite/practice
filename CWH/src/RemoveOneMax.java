
public class RemoveOneMax {
    public static String getMax(String num,char  digit){
        
        for(int i=0;i<num.length()-1;i++){
            if(digit == num.charAt(i) && num.charAt(i+1)>digit){
               return num.substring(0,i)+num.substring(i+1,num.length());
            }
        }

        int indexOfLast=num.lastIndexOf(digit);
        return num.substring(0,indexOfLast)+num.substring(indexOfLast+1,num.length());
    }
    public static void main(String[] args) {
        // You are given a string "number" representing a positive
        // integer and a character digit. Return the resulting string after removing exactly one occurrence of digit from number such that the value of the resulting string in decimal form is maximized. The test cases are generated such that digit occurs at least once in the number.
        // I/P: number = "1321"
        // digit="1"
        // O/P: 321
        String num="1321";
        char digit = '1';

        System.out.println("ANS--->");
        System.out.println(getMax(num, digit));
    }
}
