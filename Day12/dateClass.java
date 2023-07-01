package date_time;
// Is it safe to store the no of ms in a variable of type long ?
// Answer : Yes

import java.util.Date;

public class dateClass {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
    }
}


