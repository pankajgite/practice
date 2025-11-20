
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_formater {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Normal Date Time formater: "+dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String Mydate = dt.format(df);
        System.out.println(Mydate);

    }
}
