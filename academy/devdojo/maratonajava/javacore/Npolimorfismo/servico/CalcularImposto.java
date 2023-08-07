package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Monitor;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Pc;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;

public class CalcularImposto {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void CalcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calculaTaxa();
        System.out.println("produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if (produto instanceof Monitor) {
            Monitor monitor = (Monitor) produto;
            System.out.println(monitor.getTaxaDeHearts());
        }
    }
}
