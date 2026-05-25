import java.util.*;

public class TcsAi{
	public static void main(String[] arg){
		Scanner sc=  new Scanner(System.in);
		
		int n = sc.nextInt();

		if(n>1000){
			System.out.println("Length is High");
			return;
		}
		List<Data> list = new ArrayList<>();
		for(int i=0;i<n;i++){
			String key = sc.next();
			int val  = sc.nextInt();
			list.add(new Data(key,val));
		}

		Collections.sort(list,(a,b)->{
			int keyCompare = a.key.compareTo(b.key);

			if(keyCompare ==0){
				return Integer.compare(a.val,b.val);
			}
			return keyCompare;
		});
 		
		for(Data d: list){
			System.out.println(d.key+" "+d.val);	
		}
		
	}
}

class Data{
	String key;
	int val;
	public Data(String key, int val){
		this.key = key;
		this.val = val;
	}
}