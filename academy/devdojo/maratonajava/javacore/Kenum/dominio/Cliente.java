package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    //Jesus é o caminho, a verdade e a vida!!!
    private String nome;
    private int idade;
    private TipoDeCliente tipoDeCliente;
    private TipoDePagamento tipoDePagamento;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", tipoDeCliente=" + tipoDeCliente +
                ", tipoDePagamento=" + tipoDePagamento +
                '}';
    }

    public Cliente(String nome, int idade, TipoDeCliente tipoDeCliente, TipoDePagamento tipoDePagamento) {
        this.nome = nome;
        this.idade = idade;
        this.tipoDeCliente = tipoDeCliente;
        this.tipoDePagamento = tipoDePagamento;
    }

    public TipoDePagamento getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(TipoDePagamento tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public TipoDeCliente getTipoDeCliente() {
        return tipoDeCliente;
    }

    public void setTipoDeCliente(TipoDeCliente tipoDeCliente) {
        this.tipoDeCliente = tipoDeCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
