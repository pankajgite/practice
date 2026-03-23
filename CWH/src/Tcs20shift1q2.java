import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Transaction{
    String sender;
    String receiver;
    int amount;
    double maxTime;
    HashSet<Double> time;

    Transaction(String sender, String receiver, int amount, double time) {
        this.sender=sender;
        this.receiver=receiver;
        this.amount = amount;
        this.maxTime =time;
        this.time = new HashSet<>();
        this.time.add(time);
    }
    
    
}
public class Tcs20shift1q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String,Transaction> newhash = new HashMap<>();
        for(int i=0;i<n;i++){
            String sender = sc.next();
            String receiver  = sc.next();
            int amount = sc.nextInt();
            double time = sc.nextDouble();

            String key = sender+" | "+receiver+" | "+amount;

            if(newhash.containsKey(key) ){
                Transaction t = newhash.get(key);
                t.time.add(time);

                if(time>t.maxTime){
                    t.maxTime=time;
                }

            }
            else{
                newhash.put(key,new Transaction(sender,receiver,amount,time));
            }

        }
        boolean found=false;
        for(Transaction t :newhash.values()){
            if(t.time.size()>1){
                System.out.println(t.sender+" "+t.receiver+" "+t.amount+" "+t.maxTime);
                found=true;
            }
        }

        if(!found){
            System.out.println("No Dublicate");
        }
        
    }
}
