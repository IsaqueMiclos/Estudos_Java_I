package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.*;

public class SeminariosTest01 {
    public static void main(String[] args) {
        //Jesus é o caminho, a verdade e a vida!!!
        Local local = new Local("RUA PQG DF 33/8");
        Seminarios seminario1 = new Seminarios("BGM",local);
        Seminarios seminario2 = new Seminarios("BGM 02",local);
        Seminarios seminario3 = new Seminarios("BGM 03",local);
        Aluno aluno01 = new Aluno("Isaque da Silva",seminario1,16);
        Aluno aluno02 = new Aluno("Isaque",seminario3,16);
        Aluno aluno03 = new Aluno("Silva",seminario2,16);
        seminario1.setAlunos(new Aluno[]{aluno01});
        seminario2.setAlunos(new Aluno[]{aluno02});
        seminario3.setAlunos(new Aluno[]{aluno03});
        Seminarios seminarioDeFogo = new Seminarios("FOGO Without Jesus?", new Local("RUA PQG 22"), new Aluno[]{aluno01,aluno02});
        Seminarios[] seminariosDoProfessor = {seminario1,seminario2,seminario3, seminarioDeFogo};
        Professor professorPrincipal = new Professor("Geraldo","Ti",seminariosDoProfessor);


        professorPrincipal.imprime();
    }
}
