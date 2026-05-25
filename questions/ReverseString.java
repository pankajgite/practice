import java.util.*;
class ReverseString{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		String st =  sc.next();
		int count=0;
		for(int i=0; i<st.length(); i++){
			char cur = st.charAt(i);
			if(cur=='a' || cur=='e' || cur=='i'|| cur=='o'|| cur == 'u'){

				count++;
			}
		}
		System.out.print(count);
	}
}