class GM extends Thread{

    @Override
    public void run() {
        int i=0;
        while (i<10) { 
            System.out.println("Good Morning");
            try{
                Thread.sleep(200);

            }catch(Exception e){
                System.out.println(e);
            }
            i++;
        }
    }
    
}

class WL extends Thread{

    @Override
    public void run() {
        int i=0;
        while(i<10){
            System.out.println("Welcome");
            try{
                Thread.sleep(200);

            }catch(Exception e){
                System.out.println(e);
            }
            i++;
        }
        
    }
    
}

public class practChap13 {
    public static void main(String[] args) {
        GM gm = new GM();
        WL wl = new WL();
        gm.start();
        gm.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority of GM is: "+gm.getPriority());
        System.out.println("State of GM is: "+gm.getState());
        wl.start();
        System.out.println("Priority of WL is: "+wl.getPriority());
        System.out.println("State of WL is: "+wl.getState());
        System.out.println("Current Thread state: "+Thread.currentThread().getState());
    }
}
