class base{
    int x;

    public void setX(int x) {
        System.out.println("Under base setting x");
        this.x = x;
    }

    public int getX() {
        return x;
    }
    
}

class Derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}


public class Inharitance {
    public static void main(String[] args) {
        Derived d = new Derived();

        d.setX(5);
        System.out.println(d.getX());
    }
}
