package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class PessoaTest01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Congonhas 12");
        endereco.setCep("84555-301");

        Pessoa pessoa = new Pessoa("Israel","090.999.129-00");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("---------------------");

        Funcionario funcionario = new Funcionario(1999,"Luiz","089.082.029-29");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1200);

        funcionario.imprime();
    }
}
