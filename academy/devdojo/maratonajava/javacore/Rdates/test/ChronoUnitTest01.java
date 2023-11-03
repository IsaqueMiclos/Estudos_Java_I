package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    //Jesus

    public static void main(String[] args) {
        LocalDate meuAniversario = LocalDate.of(2005, 10, 15);
        LocalDate agora = LocalDate.now();
        
        System.out.println(ChronoUnit.DAYS.between(meuAniversario, agora));
        System.out.println(ChronoUnit.MONTHS.between(meuAniversario, agora));
        System.out.println(ChronoUnit.YEARS.between(meuAniversario, agora));

        System.out.println("------- LEB ------------");
        
        LocalDate lebAniversario = LocalDate.of(2019, 5, 3);
        
        System.out.println(ChronoUnit.DAYS.between(lebAniversario, agora));
        System.out.println(ChronoUnit.MONTHS.between(lebAniversario, agora));
        System.out.println(ChronoUnit.YEARS.between(lebAniversario, agora));
    }
}
