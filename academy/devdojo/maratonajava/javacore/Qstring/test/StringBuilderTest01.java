package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    //O Senhor é Jesus
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo");
        System.out.println(sb);
        sb.delete(0,14);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
