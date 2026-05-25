import java.util.*;

public class MinWinSub{
	public static String minWindow(String s, String t){
		if(s.length()<t.length()){
			return "";
		}
		HashMap<Character,Integer> target = new HashMap<>();
		for(char c: t.toCharArray()){
			target.put(c, target.getOrDefault(c,0)+1);
		}
	
		HashMap<Character,Integer> window = new HashMap<>();
		int required = target.size();
		int formed =0;
		int left=0;
		int minLen = Integer.MAX_VALUE;
		int start=0;
		
		for(int right=0; right<s.length();right++){
			char ch = s.charAt(right);

			window.put(ch, window.getOrDefault(ch,0)+1);

			if(target.containsKey(ch) &&
				window.get(ch).intValue()==target.get(ch).intValue()){
				formed++;
			}


			while(formed == required){
				if(right-left+1< minLen){
					minLen = right-left+1;
					start = left;
				}
				char leftChar = s.charAt(left);
				window.put(leftChar, window.get(leftChar)-1);
				
				if(target.containsKey(leftChar)&&
					window.get(leftChar)<target.get(leftChar)){
					formed--;
				}
				left++;
			}
		}
		return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start+minLen);

	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		System.out.println(minWindow(s,t));
		
	}
}