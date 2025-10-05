class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("I am a Thread");
            i++;
        }
    }
}

class MyThrRun implements Runnable{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Runable");
            i++;
        }
    }
}

public class Thread_constructors {
    public static void main(String[] args) {
        MyThr th = new MyThr("Pankaj");
        th.start();
        MyThrRun r1= new MyThrRun();
        Thread g1 = new Thread(r1,"Pankaj");
        g1.start();
        g1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of the Thread: "+th.getName());
        System.out.println("State of the Thread: "+th.getState());
        System.out.println("ID of the Thread: "+th.getId());
        System.out.println("Priority of the Thread: "+th.getPriority());
        System.out.println("Class of the Thread: "+th.getClass());
        System.out.println("===========================================");
        
        
        System.out.println("Name of the Thread: "+g1.getName());
        System.out.println("State of the Thread: "+g1.getState());
        System.out.println("ID of the Thread: "+g1.getId());
        System.out.println("Priority of the Thread: "+g1.getPriority());
        System.out.println("Class of the Thread: "+g1.getClass());
    }
}
