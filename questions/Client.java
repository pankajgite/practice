package questions;

public class Client{
	public static void main(String[] args){
		/*
		EarlySingletonClass earlySingletonClass1 = EarlySingletonClass.getInstance();
		EarlySingletonClass earlySingletonClass2 = EarlySingletonClass.getInstance();
		System.out.print(earlySingletonClass1 == earlySingletonClass2);
		*/
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();

		System.out.print(lazySingleton1 == lazySingleton2);

	}
}