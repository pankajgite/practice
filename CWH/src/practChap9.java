class Cylender{
    private int radius;
    private  int height;

    Cylender(int r, int h) {
        radius=r;
        height=h;
    }

    

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2 * 3.142 * radius *height + 2*3.142 *radius*radius ;
    }
    
    public double volume(){
        return 3.142* radius*radius *height;
    }

}


class Rectangle{
    private int length ;
    private int breath;

    public int getBreath() {
        return breath;
    }

    public int getLength() {
        return length;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Rectangle() {
        length=4;
        breath=5;
    }
    
    public Rectangle(int l, int b){
        length = l;
        breath = b;
    }

    

}

class Sphare{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public class practChap9 {
    public static void main(String[] args) {
        // Q1) Cecate a class Cylinder and use setlers and
        // getter to Set ito" radius and height
        Cylender mycylender = new Cylender(2,4);
        // mycylender.setRadius(2);
        // mycylender.setHeight(12);
        System.out.println("Cylender radius and height are "+mycylender.getRadius()+"&"+mycylender.getHeight());
        
        // Q2) Use O to calculate surface area and Volume
        // of the liylinder.
        System.out.println("Surface area of cylender is: "+mycylender.surfaceArea());
        System.out.println("Volume of cylender is: "+mycylender.volume());

        // Q3) Use a constructor and repeat 1
        //done

        //Q4) Overlbad a Constructor used to initialige s rectongeof kength 4 and brcadth 5 for using custom parambrs
        Rectangle r1= new Rectangle();
        System.out.println("length and breath are: "+r1.getLength() +" & "+r1.getBreath());
        Rectangle r2 = new Rectangle(5,10);
        System.out.println("length and breath are: "+r2.getLength() +" & "+r2.getBreath());

        // Q5) Refeat 1 for a sphare 
        Sphare sp= new Sphare();
        sp.setRadius(23);
        System.out.println("radius of shapre is "+sp.getRadius());

    }
}
