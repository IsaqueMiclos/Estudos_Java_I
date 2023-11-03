package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    //Jesus é bom
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Todos os espaços em branco \t \n \f \r
        // \S = Todos os caracteres exculindo os brancos
        // \w = a-Z ou A-Z, digitos, _
        // \W = Tudo o que não for incluso no "\w"
        // []

        String regex = "0[xX][0-9a-fA-F]";
        String texto = "22 0x22 0x11F 0x1 0x1222G";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
 
        while (matcher.find()) {
            System.out.println(matcher.start() + "\b");
        }
    }
}
