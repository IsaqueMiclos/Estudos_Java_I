package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoDeCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoDePagamento;

public class ClienteTest01 {
    //Jesus é o caminho, a verdade e a vida!!!

    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Kuririn", 16, TipoDeCliente.PESSOA_FISICA, TipoDePagamento.CREDITO);
        System.out.println(cliente01);
        double tipoDePagamento = TipoDePagamento.CREDITO.calculadorDeDesconto(10);
        System.out.println(tipoDePagamento);
    }
}
