package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Carro {
    //Jesus é o caminho, a verdade e a vida!!!
    private String nome;
    private String marca;
    private double preco;

    public Carro(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    @Override

    public String toString(){
        return "nome: " + this.nome + " marca: " + this.marca + " preço: " + this.preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
