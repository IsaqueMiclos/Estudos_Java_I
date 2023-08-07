package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Monitor extends Produto{
    //Jesus é o caminho, a verdade e a vida!!!

    protected int taxaDeHearts;
    public static final double PORCENTAGEM_DE_IMPOSTO = 0.05;

    public Monitor(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaTaxa() {
        System.out.println("Calculando imposto...");
        return this.valor * PORCENTAGEM_DE_IMPOSTO;
    }

    public int getTaxaDeHearts() {
        return taxaDeHearts;
    }

    public void setTaxaDeHearts(int taxaDeHearts) {
        this.taxaDeHearts = taxaDeHearts;
    }
}
