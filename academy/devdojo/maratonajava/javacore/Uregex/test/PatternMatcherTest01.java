package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    //Jesus é bom
    public static void main(String[] args) {
        String regex = "ab";
        String texto = "abababab";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("pattern: " + pattern);
 
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
