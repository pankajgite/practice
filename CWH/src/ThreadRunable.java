
class MyThread1 implements Runnable{
    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("Running Thread!!");  
            System.out.println("Running Thread 1!!");     
            i++;       
        }
    }
}

class MyThread2 implements Runnable{
    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("Running Thread 3333333333333!!");  
            System.out.println("Running Thread 2222222222222!!");      
            i++;      
        }
    }
}

public class ThreadRunable {
    public static void main(String[] args) {
        MyThread1 bullet1 = new MyThread1();
        Thread gun1 = new Thread(bullet1);

        MyThread2 bullet2 = new MyThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
        
    }
}
