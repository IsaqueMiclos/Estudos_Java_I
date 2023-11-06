package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    //Jesus é maravilhoso!
    public static void main(String[] args) {
        String diretorio = "/home/isaque/dev";
        String arquivo = "../../arquivo.txt";
        Path path1 = Paths.get(diretorio,arquivo);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path02 = Paths.get("/home/./isaque/./dev/");
        System.out.println(path02);
        System.out.println(path02.normalize());
    }
}
