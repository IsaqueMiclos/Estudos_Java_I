package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String... args) {
        Jogador jogador01 = new Jogador("Ronaldo");
        Time time = new Time("Psg");
        jogador01.setTime(time);
        jogador01.imprime();

    }
}
