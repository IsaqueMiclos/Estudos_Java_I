package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    //Jesus é maravilhoso!
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_WEEK);

        c.add(Calendar.YEAR, 1);
        c.roll(Calendar.MONTH, 7);
        Date date = c.getTime();
        System.out.println(date);
    }
}
