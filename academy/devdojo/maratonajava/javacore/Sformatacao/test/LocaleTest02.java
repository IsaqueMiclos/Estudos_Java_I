package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    //Jesus é o salvador
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        String[] isoLanguages = Locale.getISOLanguages();
        String[] isoCountries = Locale.getISOCountries();

        for (String linguas : isoLanguages) {
            System.out.print(linguas + " ");
        }

        System.out.println();

        for (String paises : isoCountries) {
            System.out.print(paises + " ");
        }
    }
}
