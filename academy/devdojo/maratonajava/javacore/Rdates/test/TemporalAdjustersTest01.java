package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjustersTest01 {
    //Jesus é bom d+
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        agora = agora.withDayOfMonth(3);
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());
    }
}
