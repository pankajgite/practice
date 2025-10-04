
class Threading1 extends Thread {
    @Override
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Doing Codeing");
            System.out.println("Feeling Happy");
            i++;
        }
    }
    
}

class Threading2 extends Thread {
    @Override
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Doing Tp ");
            System.out.println("Feeling low");
            i++;
        }
    }
    
}

public class Threading {
    public static void main(String[] args) {
        Threading1 t1= new Threading1();
        Threading2 t2 = new Threading2();
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done runing===============================");
    }
}
