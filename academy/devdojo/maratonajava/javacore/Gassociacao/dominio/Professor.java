package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    //Jesus é o caminho, a verdade e a vida!!!

    private String nome;
    private String especialidade;
    private Seminarios[] seminarios;

    public Professor(String nome, String especialidade, Seminarios[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("--- Relatório ---");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("-- Seminários Disponíveis --");
        for (Seminarios seminario : this.seminarios) {
            System.out.println("Título: " + seminario.getTitulo());
            System.out.println("Endereço: " + seminario.getLocal().getEndereco());
            System.out.println("-- Alunos Cadastrados --");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Nome: " + aluno.getNome() + " " + "Idade: " + aluno.getIdade());
            }
            System.out.println("-------------------");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios[] seminarios) {
        this.seminarios = seminarios;
    }
}
