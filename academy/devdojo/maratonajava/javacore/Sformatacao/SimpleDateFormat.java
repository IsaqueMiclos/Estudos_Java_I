package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.util.Date;

public class SimpleDateFormat {
    //Jesus é bom demais
    public static void main(String[] args) {
        String pattern = "yyyy 'de' mm 'de' dd";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }
}
