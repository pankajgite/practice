import java.util.*;

class TcsAi2{
	public static void main(String[] args){
		Scanner sc=  new Scanner(System.in);
		int n =sc.nextInt();
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
		for( int i=0; i<n; i++){
			int t = sc.nextInt();
			hm.put(t,hm.getOrDefault(t,0)+1);
		}
		
		for(Map.Entry<Integer,Integer> e: hm.entrySet()){
			for(int i=0 ; i<e.getValue(); i++){
				System.out.print(e.getKey()+" ");
			}
		}		
	}	

}