package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Cafu");
        Jogador jogador03 = new Jogador("Ronaldo");
        Time time = new Time("Brasil");

        jogador01.setTime(time);
        jogador02.setTime(time);
        jogador03.setTime(time);

        time.setJogadores(new Jogador[]{jogador01,jogador02,jogador03});

        System.out.println("--- Jogadores ---");
        jogador01.imprime();
        jogador02.imprime();
        jogador03.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
