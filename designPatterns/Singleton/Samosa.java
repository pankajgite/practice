public class Samosa{

	private static Samosa samosa;
	private Samosa(){}


	//Lazy way of initialization
	//public synchronized static Samosa getSamosa(){  method synchronization
	public synchronized static Samosa getSamosa(){

		if(samosa ==null){
			synchronized(Samosa.class){
				if(samosa ==null){
					samosa = new Samosa();
				}

			}

			
		}
		return samosa;
		
	}

	
}