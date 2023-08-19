package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    //Jesus
    public static void main(String[] args) {
        Locale japao = Locale.JAPAN;
        Locale china = new Locale("cn", "CN");
        Locale ingles = new Locale("en", "US");

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(japao);
        nfa[2] = NumberFormat.getCurrencyInstance(china);
        nfa[3] = NumberFormat.getCurrencyInstance(ingles);

        double valor01 = 200_000.53D;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor01));
        }

        System.out.println(china.getDisplayCountry(china));
    }
}
