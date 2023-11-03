package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    //Jesus é bom
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Todos os espaços em branco \t \n \f \r
        // \S = Todos os caracteres exculindo os brancos
        // \w = a-Z ou A-Z, digitos, _
        // \W = Tudo o que não for incluso no "\w"
        // []
        // ? zero ou uma ocorrência
        // * zero ou mais
        // + uma ou mais
        // {n,m} de "n" até "m"
        // ()
        // | o(v|c)o ovo | oco
        // $ fim da linha
        // . 1.3 = 123, 133, 1_3 coringa

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "22 0x22 0x11F 0x1 0x1222G";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
 
        while (matcher.find()) {
            System.out.println(matcher.start() + " ");
        }
    }
}
