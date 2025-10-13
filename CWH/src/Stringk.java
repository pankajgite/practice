public class Stringk {
    public static void main(String[] args) {
        
        String[] strs = {"flower","flow","flight"};

        System.out.println("Final Return is: " +longestCommonPrefix(strs));

    }

    //same = flower
    // if f == f

    public static  String longestCommonPrefix(String[] strs){
        String start=strs[0];
        String Same="";
        for(int i=0; i<start.length();i++){
            Character a=strs[0].charAt(i);//f
            System.out.println("Entering 1St loop"+i);
            boolean check=true;
            for(int j=0;j<strs.length;j++){
                System.out.println("Entering 2nd loop"+j);

                if(a==strs[j].charAt(i)){
                    a=strs[j].charAt(i);
                    System.out.println("Entering if with i: "+i+" j:"+j);
                }
                else{
                    System.out.println("else braking with i: "+i+" j:"+j);
                    check=false;
                    break;

                }
            
            }
            if(check=false){
                break;
            }
            
            System.out.println("Same Before changeing: "+ Same);
            Same=Same+a;
            System.out.println("Same After changeing: "+ Same);
        }
        




        return Same;
    }
}
