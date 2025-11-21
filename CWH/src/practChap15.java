
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class practChap15 {
    public static void main(String[] args) {
        // // Question 1 Make an array list and store names of 10 students in it 
        // ArrayList<String> Snames = new ArrayList<>();
        // Snames.add("Pankaj");
        // Snames.add("Gite");
        // Snames.add("Karan");
        // Snames.add("Kapse");
        // Snames.add("shubham");
        // Snames.add("shindhe");

        // for(int i=0;i<Snames.size();i++){
        //     System.out.println(i+1+") "+Snames.get(i));
        // }

        //Question 2 use date class in java to print following format : 21:47:02
        Date d = new Date();
        System.out.print(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        System.out.println();

        //Question 3   Q2 using calendar class 
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.get(Calendar.HOUR_OF_DAY)+":"+ c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));
        
        //Question 4 Q3 using java time api 

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        LocalDateTime dt = LocalDateTime.now();
        String  var = df.format(dt);
        System.out.println(var);




        // //Question 5 Create a set in java Try to store 
        // // dublicate elements inside this set and verify that only one instance is stored 
        // Set<Integer> s1 = new HashSet<>();
        // s1.add(0);
        // s1.add(1);
        // s1.add(2);
        // s1.add(3);
        // s1.add(2);
        // s1.add(4);

        // System.out.println(s1);

    }
}
