class Circle{
    private double radius;
    private double circumferance;
    public String setRadius(double r){
        radius=r;
        return "Successfully Updated";
    }
    public double getRadius(){
        return radius;
    }
    public double getCircumferance(){
        return circumferance;
    }
    public String setCircumferance(double p){
        if(p==(2*3.14*radius)){
            circumferance=p;
            return "Succesfully Updated";
        }
        else{
            return "Circumfarence does not Matched not updated"+2*3.14*radius;
        }
    }


}

public class accessModifiersCircle {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Circle cir =new Circle();
        System.out.println(cir.setRadius(2));
        System.out.println(cir.setCircumferance(12.56));
        
    }
}
