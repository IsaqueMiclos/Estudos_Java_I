package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Mouse extends Produto {
    //Jesus é bom
    public static final double IMPOSTO_SOBRE_MOUSES = 0.3;

    public Mouse(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaTaxa() {
        return this.valor * IMPOSTO_SOBRE_MOUSES;
    }
}
