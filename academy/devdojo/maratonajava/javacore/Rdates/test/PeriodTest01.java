package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    //Jesus filho de Deus

    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        LocalDate daquiTresMeses = LocalDate.now().plusMonths(3);

        Period p1 = Period.between(agora, daquiTresMeses);
        Period p2 = Period.ofYears(3);
        Period p3 = Period.ofMonths(3);
        Period p4 = Period.ofWeeks(7);
        Period p5 = Period.ofDays(20);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}
