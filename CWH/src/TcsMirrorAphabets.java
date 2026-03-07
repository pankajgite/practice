

public class TcsMirrorAphabets {
    public static String getMirror(String s){
        int n= s.length();
        String news = "";
        for(int i=0;i<n;i++){
           char mirror = (char)('Z'- (s.charAt(i)-'A'));
           news = news +mirror;
            
        }
        return news;
    }
    public static void main(String[] args) {
        String s= "KZMPZQ";
        System.out.println(getMirror(s));

    }
}
