package date_time;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class gregorian {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        // to duplicate the lines in Intellij the shortcut is : cmd + d
        GregorianCalendar cal  = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2024));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);


    }
}



