package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, byte, char, short, long, boolean
        int age = 10;
        long numeroMaior = 10000L;
        double salarioDecimal = 2500.55D;
        float salario = 2500.55F;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0043';
        String name = "Isaque da Silva Miclos";

        System.out.println("A idade é de "+age+" anos");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(salarioDecimal);
        System.out.println(salario);
        System.out.println("Olá meu nome é "+name);
    }
}
