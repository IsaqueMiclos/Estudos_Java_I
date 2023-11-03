package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class DateTimeFormatterTest01 {
    //Jesus
    public static void main(String[] args) {
        LocalDate dataDeHoje = LocalDate.now();
        String s1 = dataDeHoje.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = dataDeHoje.format(DateTimeFormatter.ISO_DATE);
        String s3 = dataDeHoje.format(DateTimeFormatter.ISO_LOCAL_DATE);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("2023-10-05", DateTimeFormatter.ISO_DATE);
        System.out.println(parse1);

        DateTimeFormatter formatterUsa = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String UsaFormat = LocalDate.now().format(formatterUsa);
        System.out.println("United States of America Format: " + UsaFormat);

        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String BrFormat = LocalDate.now().format(formatterBr);
        System.out.println("Brazilian Format: " + BrFormat);
    }
}
