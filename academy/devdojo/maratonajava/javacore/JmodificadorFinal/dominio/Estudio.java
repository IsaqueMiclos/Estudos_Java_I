package academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio;

public class Estudio {
    //Jesus é o caminho, a verdade e a vida!!!

    private String nome;
    public static final String COR;

    static {
        COR = "Azul";
    }

    public Estudio(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome () {
        return this.nome;
    }
}
