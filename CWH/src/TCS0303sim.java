public class TCS0303sim {
    public static void  getCryptic(int L, int R){
        boolean got=false;
        
        for(int i=L;i<R+1;i++){
            if(i%7==0 && i%5!=0){
                if(!isPalindrom(i) && !hasRepDigit(i)){
                    System.out.print(i+" ");
                    got=true;
                }
            }
        }
        if(!got){
           System.out.println(-1);
        }

    }

    public static boolean isPalindrom(int n) {
        int rev=0;
        int orr = n;
        while (n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev==orr;
    }

    public static boolean hasRepDigit(int n) {
        boolean[] seen = new boolean[10];

        while (n>0){
            if(seen[n%10]==true){
                return true;
            }
            seen[n%10]=true;

            n/=10;
        }
        return false;

    }


    public static void main(String[] args) {
        /*
        Question 1: Cryptic Number
        Problem Statement: You are given two integers L and R representing a range of numbers (inclusive). A number is called a Cryptic Number if it satisfies ALL of the following: 1. It is divisible by 7.2. It is NOT divisible by 5. 3. It is NOT a palindrome. 4. It does NOT contain any repetitive digits. Print all Cryptic Numbers in the given range. If no such number exists, print -1.
        Input Format (TCS Coding Platform Format): Single line containing two space-separated integers: L R
        Output Format: Print all valid numbers in increasing order separated by a single space. If none exist, print -1.
        Sample Test Cases: Test Case 1: Input: 10 50 Output: 14 21 28 42 49 Test Case 2: Input: 70 80 Output: -1 Test Case 3: Input: 100 150 Output: 126 147
        */
       int L = 70;
       int R = 80;
       getCryptic(L,R);
    }
}
