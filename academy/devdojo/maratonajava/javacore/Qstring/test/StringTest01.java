package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    //Jesus é maravilhoso
    public static void main(String[] args) {
        String nome = "Isaque"; //String constant pool
        String nome2 = "Isaque";
        nome = nome.concat(" Miclos");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Isaque");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
