package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {
    //Jesus é o caminho, a verdade e a vida!!!

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados....");
    }

    @Override
    public void checarPermissao() {
        System.out.println("Checando permissão para banco de dados...");
    }
}
