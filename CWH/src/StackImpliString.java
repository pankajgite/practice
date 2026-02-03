
import java.util.Stack;

public class  StackImpliString {
    public static boolean  checkPattern(String str){
        Stack<Character> st = new Stack<>();

        for (char e : str.toCharArray()) {
            if(e =='(' || e == '{' || e=='['){
                st.push(e);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if(e == ')' && top!='('||
                    e == '}' && top!='{' ||
                    e == '[' && top!=']'
                ){
                    return false;
                }
            }
            
        }
        return st.isEmpty();

    }
    public static void main(String[] args) {
        String str="{[(])}";
        System.out.println(checkPattern(str));
    }
}
