package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    //Jesus é o caminho, a verdade e a vida!!!

    public static void main(String... args) {
        Anime anime = new Anime();
        anime.init2("One piece",1034,  "TV","Shonnen");
        anime.imprime();
    }
}
