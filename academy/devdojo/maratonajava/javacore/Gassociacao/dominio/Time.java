package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    //Jesus é o caminho, a verdade e a vida!!!
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (jogadores == null) return;
        System.out.print("Jogadores: ");
        for (Jogador jogador : jogadores) {
            System.out.print(jogador.getNome() + " ");
        }
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
