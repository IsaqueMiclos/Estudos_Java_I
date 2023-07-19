package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Pedro");
        Jogador jogador03 = new Jogador("Di Maria");

        Jogador[] jogadores = new Jogador[]{jogador01,jogador02,jogador03};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
