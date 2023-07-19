package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        Professor professor01 = new Professor();
        professor01.nome = "GOKU";
        professor01.idade = 22;
        professor01.sexo = 'M';

        System.out.println("Nome: " + professor01.nome + " idade: " + professor01.idade + " sexo: " + professor01.sexo);
    }
}
