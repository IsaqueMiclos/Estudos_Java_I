package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeException03 {
    //Jesus é bom para mim
    public static void main(String[] args) {
        abreConecxao2();
    }

    private static String abreConecxao() {
        try {
            System.out.println("Iniciando");
            System.out.println("Escrevendo");
            return "Conecxão aberta";
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Desligando recurso...");
        }
        return null;
    }

    private static void abreConecxao2() {
        try {
            System.out.println("Iniciando");
            System.out.println("Escrevendo");
            throw new RuntimeException();
        } finally {
            System.out.println("Desligando recurso...");
        }
    }

}
