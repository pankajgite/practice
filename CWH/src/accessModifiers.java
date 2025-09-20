class myEmployee{
    private int id;
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
public class accessModifiers {
    public static void main(String[] args) {
        myEmployee employee = new myEmployee();
        // employee.id =24;
        employee.setId(12);
        employee.setName("pankaj");
        System.out.println(
            "Employee Details are as follows:\n"
            +"ID: "+ employee.getId()+"\nName: "+ employee.getName()
        );
    }
}
