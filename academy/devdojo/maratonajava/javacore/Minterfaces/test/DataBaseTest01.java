package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataBaseTest01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String... args) {
        DataBaseLoader zezim = new DataBaseLoader();
        FileLoader zezao = new FileLoader();
        zezim.load();
        zezao.load();

        zezim.remove();
        zezao.remove();

        zezao.checarPermissao();
        zezim.checarPermissao();

        System.out.println(DataLoader.MAX_VALUE);
    }
}
