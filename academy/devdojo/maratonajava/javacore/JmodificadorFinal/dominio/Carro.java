package academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio;

public class Carro {
    //Jesus é o caminho, a verdade e a vida!!!
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador("Kuririn");

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
