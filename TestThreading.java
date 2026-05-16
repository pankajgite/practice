class MyNumber extends Thread{
	public void run(){
		for(int i=1;i<11;i++){
			System.out.print(i+ ",");
			//Thread.yield();
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class Mycharacter extends Thread{
	public void run(){
		for(char i='A'; i<='J'; i++){
			System.out.print(i+ ",");
		}
	}
}


class MyThreeDigit implements Runnable{
	public void run(){
		for(int i=100;i<110;i++){
			System.out.print(i+ ",");
		}
	}
}
public class TestThreading{
	public static void main(String[] args) throws Exception{
		MyNumber myNumber = new MyNumber();
		Mycharacter mycharacter = new Mycharacter();
		MyThreeDigit myThreeDigit = new MyThreeDigit();
		Thread myThread = new Thread(myThreeDigit);
		
		myNumber.start();
		mycharacter.start();
		myThread.start();

		
		myNumber.join();
		
		System.out.println("ending");
	}
}