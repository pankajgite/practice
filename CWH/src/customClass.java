class Employee{
        int id ;
        String name;
        public void printDetails(){
            System.out.println("My name is "+name);
            System.out.println("& My ID is "+id);
        }
    }

public class customClass {
    
    public static void main(String[] args) {
        System.out.println("Lets Go..");
        Employee pankaj =new Employee();
        pankaj.id=25;
        pankaj.name="Pankaj";
        pankaj.printDetails();
        // System.out.println(pankaj.id);
        // System.out.println(pankaj.name);
    }
}
