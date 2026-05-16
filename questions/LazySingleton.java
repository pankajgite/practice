package questions;

public class LazySingleton{
	private LazySingleton(){
	}
	private static LazySingleton ins=null;

	public static LazySingleton getInstance(){
		if(ins ==null){
			synchronized(LazySingleton.class){
				if(ins == null){
					return ins = new LazySingleton();
				}
				return ins;
			}
		}
		return ins;

	}
}