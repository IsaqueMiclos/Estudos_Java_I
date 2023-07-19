package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Monitor;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Pc;

public class CalcularImposto {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void CalcularImpostoPc(Pc pc) {
        System.out.println("Relatório de imposto do pc");
        double imposto = pc.calculaTaxa();
        System.out.println("Pc: " + pc.getNome());
        System.out.println("Valor: " + pc.getValor());
        System.out.println("imposto: " + imposto);
    }

    public static void CalcularImpostoMonitor(Monitor monitor) {
        System.out.println("Relatório de imposto do Monitor");
        double imposto = monitor.calculaTaxa();
        System.out.println("Monitor: " + monitor.getNome());
        System.out.println("Valor: " + monitor.getValor());
        System.out.println("imposto: " + imposto);
    }
}
