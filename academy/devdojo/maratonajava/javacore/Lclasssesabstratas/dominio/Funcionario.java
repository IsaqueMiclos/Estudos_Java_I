package academy.devdojo.maratonajava.javacore.Lclasssesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    //Jesus é o caminho, a verdade e a vida!!!
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
