package academy.devdojo.maratonajava.javacore.Eblocosinicalizacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicalizacao.dominio.Anime;

public class AnimeTest01 {
    //Jesus é o caminho, a verdade e a vida!!!

    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

        System.out.println(anime.getNome());
    }
}
