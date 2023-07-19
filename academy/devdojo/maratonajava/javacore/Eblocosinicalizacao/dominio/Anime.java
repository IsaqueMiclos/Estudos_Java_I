package academy.devdojo.maratonajava.javacore.Eblocosinicalizacao.dominio;

public class Anime {
    //Jesus é o caminho, a verdade e a vida!!!
    private String nome;
    private int[] episodios;

    {
        this.episodios = new int[100];

        for (int i = 0; i < this.episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
