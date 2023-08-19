package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    //Jesus é o caminho, a verdade e a vida!!!!
    public static void main(String[] args) {
        String nome = "         Tsukasa        ";
        String numbers = "01234";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace('T','J'));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(numbers.substring(2));
        System.out.println(numbers.substring(2,5));
        System.out.println(nome.trim());//remove os valores em branco da string
    }
}
