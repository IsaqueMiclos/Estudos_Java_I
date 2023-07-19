package academy.devdojo.maratonajava.javacore.JmodificadorFinal.test;

import academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio.Carro;

public class CarroTest01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String... args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Goku");
        System.out.println(carro.COMPRADOR.getNome());
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR.getNome());
    }
}
