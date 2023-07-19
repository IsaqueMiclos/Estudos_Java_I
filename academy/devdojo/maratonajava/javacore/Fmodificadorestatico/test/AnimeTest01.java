package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Anime;

public class AnimeTest01 {
    //Jesus é o caminho, a veradade e a vida!!!
    public static void main(String... args) {
        Anime anime01 = new Anime();
        Anime.setEpisodios(new int[]{1,2,3,4,5,6,7,8,9,10,11,12});
        for (int ep : Anime.getEpisodios()) {
            System.out.print(ep + " ");
        }
    }
}
