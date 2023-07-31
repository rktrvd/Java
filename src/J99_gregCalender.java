import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class J99_gregCalender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        // System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));

        System.out.println(TimeZone.getAvailableIDs());
    }
}
