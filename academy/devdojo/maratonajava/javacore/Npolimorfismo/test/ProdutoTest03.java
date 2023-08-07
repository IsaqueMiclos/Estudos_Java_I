package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Monitor;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Pc;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalcularImposto;


public class ProdutoTest03 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        Produto produto = new Pc("RK9",11000);
        Monitor monitor = new Monitor("KNZ007",1500);
        monitor.setTaxaDeHearts(150);
        CalcularImposto.CalcularImposto(monitor);
    }
}
