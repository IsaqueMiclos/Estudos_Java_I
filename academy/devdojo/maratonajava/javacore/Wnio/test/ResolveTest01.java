package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    //Jesus é o caminho, a verdade e a vida!!!

    public static void main(String[] args) {
        Path dir = Paths.get("home/isaque");
        Path arquivo = Paths.get("dev/File.txt");
        Path resolvido = dir.resolve(arquivo);
        System.out.println(resolvido);

        Path absoluto = Paths.get("/home/isaque");
        Path relativo = Paths.get("dev");
        Path arquivo02 = Paths.get("File.txt");

        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(arquivo02));
        System.out.println("3 " + relativo.resolve(absoluto));
        System.out.println("4 " + relativo.resolve(arquivo02));
        System.out.println("5 " + arquivo02.resolve(absoluto));
        System.out.println("6 " + arquivo02.resolve(relativo));
    }
}
