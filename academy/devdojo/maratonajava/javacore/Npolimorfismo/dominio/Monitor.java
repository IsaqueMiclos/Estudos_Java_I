package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Monitor extends Produto{
    //Jesus é o caminho, a verdade e a vida!!!
    public static final double PORCENTAGEM_DE_IMPOSTO = 0.05;
    public Monitor(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaTaxa() {
        System.out.println("Calculando imposto...");
        return this.valor * PORCENTAGEM_DE_IMPOSTO;
    }
}
