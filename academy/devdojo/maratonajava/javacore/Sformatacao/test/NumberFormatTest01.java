package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    //Jesus
    public static void main(String[] args) {
        Locale japao = Locale.JAPAN;
        Locale china = new Locale("cn", "CN");
        Locale ingles = new Locale("en", "US");

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(japao);
        nfa[2] = NumberFormat.getInstance(china);
        nfa[3] = NumberFormat.getInstance(ingles);

        double valor01 = 200_000.53D;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor01));
        }
    }
}
