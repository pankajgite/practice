interface Bicyle{
    void applyBrack(int decrement);
    void speedUp(int increment);
}

class avaonBycle implements Bicyle{
    void blowHorn(){
        System.out.println("POOO peeee");
    }
    public void applyBrack(int decrement){
        System.out.println("applying break!!");
    }
    public void speedUp(int increment){
        System.out.println("accelerating");
    }
}

public class Interfacej {
    public static void main(String[] args) {

        
    }
}
