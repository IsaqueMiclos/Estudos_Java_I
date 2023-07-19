package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Pc extends Produto{
    //Jesus é o caminho, a verdade e a vida!!!
    public static final double PORCENTAGEM_DE_IMPOSTO = 0.16;
    public Pc(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaTaxa() {
        System.out.println("Calculando imposto sobre pc");
        return this.valor * PORCENTAGEM_DE_IMPOSTO;
    }
}
