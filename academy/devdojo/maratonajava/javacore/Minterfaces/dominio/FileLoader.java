package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados....");
    }
    //Jesus é o caminho, a verdade e a vida!!!


    @Override
    public void checarPermissao() {
        System.out.println("Checando permissão para arquivos...");
    }
}
