
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class callenderClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Calender type: "+c.getCalendarType());
        System.out.println("Time: "+c.getTime());
        System.out.println("Time ZOne used: "+c.getTimeZone());
        System.out.println("Date: "+c.get(Calendar.DATE));
        System.out.print("Time: ");
        System.out.println("MIN: "+c.get(Calendar.MINUTE));
        System.out.println("Hours: "+c.get(Calendar.HOUR));
        System.out.println("Seconds: "+c.get(Calendar.SECOND));
        System.out.println("Day Of week: "+c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hour Of day:"+ c.get(Calendar.HOUR_OF_DAY));

        System.out.println("==============================================================");
        System.out.println("Canadian Time Zone👇");
        System.out.println("==============================================================");

        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Canada/Pacific"));
        System.out.println("Calender type: "+c1.getCalendarType());
        System.out.println("Time: "+c1.getTime());
        System.out.println("Time ZOne used: "+c1.getTimeZone());
        System.out.println("Date: "+c1.get(Calendar.DATE));
        System.out.print("Time: ");
        System.out.println("MIN: "+c1.get(Calendar.MINUTE));
        System.out.println("Hours: "+c1.get(Calendar.HOUR));
        System.out.println("Seconds: "+c1.get(Calendar.SECOND));
        System.out.println("Day Of week: "+c1.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hour Of day:"+ c1.get(Calendar.HOUR_OF_DAY));
        

        GregorianCalendar g1 = new GregorianCalendar();
        System.out.println("Is leep Year"+ g1.isLeapYear(2024));

        LocalDate  d = LocalDate.now();
        System.out.println("Local Date: "+d);
        LocalTime t = LocalTime.now();
        System.out.println("Local Time: "+t);
        LocalDateTime lt = LocalDateTime.now();
        System.out.println("Local DateTime: "+lt);
    }
}
