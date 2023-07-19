package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.PessoaTipo02;

public class PessoaTipo02Test01 {
    //Jesus is the way, the truth and the life!!!
    public static void main(String... args) {
        PessoaTipo02 pessoa = new PessoaTipo02();
        pessoa.setNome("Isaque da Silva");
        pessoa.setIdade(17);
        pessoa.setComidaFavorita("Macarronada");

        pessoa.imprime();
    }
}
