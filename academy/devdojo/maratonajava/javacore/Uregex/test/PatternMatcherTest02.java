package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    //Jesus é bom
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Todos os espaços em branco \t \n \f \r
        // \S = Todos os caracteres exculindo os brancos
        // \w = a-Z ou A-Z, digitos, _
        // \W = Tudo o que não for incluso no "\w"
        String regex = "\\w";
        String texto = "ab34__2_42babab";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("pattern: " + pattern);
 
        while (matcher.find()) {
            System.out.print(matcher.start() + "");
        }
    }
}
