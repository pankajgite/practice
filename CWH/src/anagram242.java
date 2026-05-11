import java.util.Arrays;

public class anagram242 {
    public static boolean isAnagram(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);
        
        s= new String(sarr);
       
        t= new String(tarr);
        
        return s.equals(t);
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
