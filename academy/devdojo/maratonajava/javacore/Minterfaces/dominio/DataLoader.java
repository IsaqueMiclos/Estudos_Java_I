package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    //Jesus é o caminho, a verdade e a vida!!!
    public static final int MAX_VALUE = 88;
    public abstract void load();
    default void checarPermissao() {
        System.out.println("Checando as permissões...");
    }
}
