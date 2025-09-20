class MyEmployee{
    private int id;
    public MyEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    private String name;
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }


}

public class constructors {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee(22,"Karan");
        
        // emp.setId(12);
        // emp.setName("pankaj");
        System.out.println(
            "Employee Details are as follows:\n"
            +"ID: "+ emp.getId()+"\nName: "+ emp.getName()
        );
    }
}
