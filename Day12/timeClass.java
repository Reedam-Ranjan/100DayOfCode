package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class timeClass {
    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

    }
}

