package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    //Jesus é o caminho, a verdade e a vida!!!
    private String nome;
    private static int[] episodios;

    static {
        Anime.episodios = new int[100];

        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = i + 1;
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

    public static void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }

    public static int[] getEpisodios() {
        return Anime.episodios;
    }
}
