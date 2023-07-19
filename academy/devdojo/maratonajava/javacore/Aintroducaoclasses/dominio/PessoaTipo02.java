package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class PessoaTipo02 {
    //Jesus é o caminho,a verdade e a vida!!!
    private String nome;
    private int idade;
    private String comidaFavorita;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public String getNome() {
        return this.nome;
    }

    public String getComidaFavorita() {
        return this.comidaFavorita;
    }

    public int getIdade() {
        return idade;
    }

    public void imprime() {
        if (this.nome == null || this.idade == 0 || this.comidaFavorita == null) {
            return;
        }

        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.comidaFavorita);
    }
}
