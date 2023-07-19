package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    //Jesus é o caminho, a verdade e a vida!!!
    private String nome;
    private Time time;

    public void imprime() {
        System.out.println(this.nome);
        if (time != null) {
            System.out.println(this.time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
