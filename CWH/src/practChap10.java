class rectangle{
     double length;
     double breath;

    public rectangle() {
        length=4;
        breath=2;
    }

    public rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }

    public double area(){
        return length*breath;
    }

}
class cuboid extends rectangle{
    double width;
    public cuboid() {
        width=2;
    }

    public cuboid( double length, double breath ,double width) {
        super(length, breath);
        this.width = width;
    }
    

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double volume(){
        return length*breath*width;
    }
    
}

public class practChap10 {
    public static void main(String[] args) {
        cuboid cu = new cuboid(10,5,2.5);
        System.out.println("volume of cuboid is: "+cu.volume());
        System.out.println("Area of recangle is: "+cu.area());
    }
   
    

}
