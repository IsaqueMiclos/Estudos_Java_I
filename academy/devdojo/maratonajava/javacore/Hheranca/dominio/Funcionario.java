package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    //Jesus é o caminho, a verdade e a vida!!!
    private double salario;

    public Funcionario(double salario,String nome, String cpf) {
        super(nome,cpf);
        this.salario = salario;
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " confirmo o recebimento do salário de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
