package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    //Jesus é o caminho, a verdade e a vida!!!

    private String nome;
    private int episodios;
    private String tipo;
    private String genero;

    private String estudio;

    public Anime(String nome, int episodios, String tipo, String genero) {
        this.nome = nome;
        this.episodios = episodios;
        this.tipo = tipo;
        this.genero = genero;
    }

    public Anime(String nome, int episodios, String tipo, String genero, String estudio) {
        this(nome, episodios, tipo, genero);
        this.estudio = estudio;
    }

    public Anime() {

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void init(String nome, int episodios, String tipo) {
        this.nome = nome;
        this.episodios = episodios;
        this.tipo = tipo;
    }

    public void init2(String nome, int episodios, String tipo, String genero) {
        init(nome, episodios, tipo);
        this.genero = genero;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return this.nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }
}
