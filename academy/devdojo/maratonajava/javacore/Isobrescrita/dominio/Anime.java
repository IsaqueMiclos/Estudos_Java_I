package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    //Jesus é o caminho, a verdade e a vida!!!
    private String nome;

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
