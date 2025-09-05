

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String na){
        name = na;
    }
    public void setSalary(int sal){
        salary= sal;
    }

}

class cellPhone{
    public void vibrate(){
        System.out.println("Vibrating.....");
    }
    public void cal(){
        System.out.println("calling....");
    }
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void cam(){
        System.out.println();
    }
}

class square{
    double size;

    public double getSize() {
        return size;
    }
    public void setSize(double siz){
        size=siz;
    }
    public double area(double size){
        return size*size;
    }
    public double parimeter(double size){
        return 4*size;
    }
}

class rectangle{
    double length;
    double breath;
    public double getLength(){
        return length;
    }
    public double getBreath(){
        return breath;
    }
    public void setLength(double l){
        length=l;
    }
    public void setBreath(double b){
        breath=b;
    }
    public double area(double l,double b){
        return l*b;
    }
    public double perimeter(double l, double b){
        return 2*(l+b);
    }
}

class tommyVecetti{
    public void run(){
        System.out.println("Running...");
    }
    public void turnl(){
        System.out.println("Turning Left . ");
    }
    public void turnr(){
        System.out.println("Turning Right .");
    }
    public void hit(){
        System.out.println("Hitting.");
    }
    public void fire(){
        System.out.println("Fireing ....");
    }
}

class circle{
    double radius;
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius=r;
    }
    public double area(double r){
        return (3.14*(r*r));
    }
    public double paremeter(double r){
        return 2*3.14*r;
    }
}

public class practChap8 {
    public static void main(String[] args) {
        // Question 1 create a class Employee with following propertics and methods:
        // Salary (propertly) (int) get Salany( me thad rehurtning int
        // name & property) (sting)
        // get Name (me thod returning Sting)
        // Set Name (method changing name)

        // Employee pankaj =new Employee();
        // pankaj.salary = 23;
        // pankaj.name="Pankaj";
        // System.out.println(pankaj.getSalary());
        // System.out.println(pankaj.getName());
        // Employee joy= new Employee();
        // joy.setName("joy kumar");
        // joy.setSalary(35000);
        // System.out.println(joy.getName());
        // System.out.println(joy.getSalary());

        // Question 2 Create a class collphone with methads to print "Vibrating" "ringing... etc

        // cellPhone phone = new cellPhone();
        // phone.cal();

        // Question 3  Crcats a class square with a method to initialize its Side, Calculating area, perimeter ete
        // square sq= new square();
        // sq.setSize(2);
        // System.out.println("length of square: "+sq.getSize());
        // System.out.println("Area of Square is: "+sq.area(sq.getSize()));
        // System.out.println("Peremeter of Square is: "+sq.parimeter(sq.getSize()));

        //Question 4 Create same as question 3 for rectangle
        // rectangle rec =new rectangle();
        // rec.setLength(4);
        // rec.setBreath(2);
        // System.out.println("The Length of rectangle is "+rec.getLength()+" and Breath is "+ rec.getBreath());
        // System.out.println("Area of Rectangle is: "+rec.area(rec.getLength(), rec.getBreath()) );
        // System.out.println("Peremeter of Rectangle is: "+rec.perimeter(rec.getLength(), rec.getBreath()));

        // Question 5 Ceate a class Tommy Vecetti for Rackstar Games capalle of hitting (prlat hetting.), nrunning, firing ek.
        // tommyVecetti gta =new tommyVecetti();

        // gta.run();
        // gta.turnl();
        // gta.run();
        // gta.run();
        // gta.hit();
        // gta.run();
        // gta.turnr();
        // gta.fire();
        // gta.fire();
        // gta.run();
        // gta.run();

        // Question 6 Repeat question 4 for circle
        circle cir = new circle();
        cir.setRadius(2);
        System.out.println("The Circle is of Radius is: "+cir.getRadius());
        System.out.println("Area of Circle is: "+ cir.area(cir.getRadius()));
        System.out.println("Circumferance of Circle is: "+cir.paremeter(cir.getRadius()));


    }
}
