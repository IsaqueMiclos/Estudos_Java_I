package academy.devdojo.maratonajava.javacore.Lclasssesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclasssesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclasssesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclasssesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        Gerente gerente0001 = new Gerente("NAMI", 9000);
        System.out.println(gerente0001);

        Desenvolvedor desenvolvedor0001 = new Desenvolvedor("ZORO", 7000);
        System.out.println(desenvolvedor0001);

        gerente0001.imprime();
        desenvolvedor0001.imprime();
    }
}
