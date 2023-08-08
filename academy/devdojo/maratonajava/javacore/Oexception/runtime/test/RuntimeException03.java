package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeException03 {
    //Jesus é bom para mim
    public static void main(String[] args) {

    }

    private static void abreConecxao() {
        try {
            System.out.println("Iniciando");
            System.out.println("Escrevendo");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Desligando recurso...");
        }
    }

}
