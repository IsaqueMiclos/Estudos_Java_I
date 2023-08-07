package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Monitor;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Mouse;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Pc;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalcularImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        //Jesus é o caminho, a verdade e a vida!!!
        Pc pc01 = new Pc("NEW BANGOOK MARK 03", 1999.99);
        Monitor monitor1 = new Monitor("ASUS A80", 1000);
        Mouse mouse = new Mouse("Kratos 2000", 320);

        CalcularImposto.CalcularImposto(pc01);
        System.out.println("-----------DIVISOR-----------");
        CalcularImposto.CalcularImposto(monitor1);
        System.out.println("-----------DIVISOR-----------");
        CalcularImposto.CalcularImposto(mouse);
    }
}
