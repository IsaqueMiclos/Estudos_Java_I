package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aluno {
    //Jesus é o caminho, a verdade e a vida!!!
    private String nome;
    private Seminarios seminario;
    private int idade;

    public Aluno(String nome, Seminarios seminario, int idade) {
        this.nome = nome;
        this.seminario = seminario;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminarios getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminarios seminario) {
        this.seminario = seminario;
    }
}
