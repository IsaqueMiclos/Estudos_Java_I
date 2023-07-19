package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminarios {
    //Jesus é o caminho, a verdade e a vida!!!
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminarios(String titulo,Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminarios(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String endereco) {
        this.titulo = endereco;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
