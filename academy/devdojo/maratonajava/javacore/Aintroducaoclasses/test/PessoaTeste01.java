package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTeste01 {
    //Jesus é o caminho, a verdade e a vida
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa();
        pessoaUm.name = "Zoro";
        pessoaUm.age = 21;
        pessoaUm.sex = 'M';
        pessoaUm.born = "12/12/1997";
        System.out.println(pessoaUm.name);
        System.out.println(pessoaUm.age);
        System.out.println(pessoaUm.sex);
        System.out.println(pessoaUm.born);
    }
}
