package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    //Jesus é maravilhoso!
    public static void main(String[] args) {
        Locale italia = new Locale("it","IT");
        Locale brasil = new Locale("pt","BR");
        Locale japao = new Locale("ja","JP");
        Locale holanda = new Locale("nl","NL");
        Calendar c = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, italia);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, japao);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, holanda);

        System.out.println("Itália: " + df1.format(c.getTime()));
        System.out.println("Brasil: " + df2.format(c.getTime()));
        System.out.println("Japão: " + df3.format(c.getTime()));
        System.out.println("Holanda: " + df4.format(c.getTime()));

        System.out.println(japao.getDisplayCountry(japao));
        System.out.println(holanda.getDisplayCountry(holanda));
    }
}
