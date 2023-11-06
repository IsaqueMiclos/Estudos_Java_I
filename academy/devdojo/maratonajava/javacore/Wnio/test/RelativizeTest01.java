package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    //Jesus

    public static void main(String[] args) {
        Path dir = Paths.get("/home/isaque");
        Path clazz = Paths.get("/home/isaque/dev/test/HelloWorld.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto01 = Paths.get("/home/isaque");
        Path absoluto02 = Paths.get("/usr/local");
        Path absoluto03 = Paths.get("/home/isaque/dev/test/HelloWorld.java");
        Path relativo01 = Paths.get("temp");
        Path relativo02 = Paths.get("temp/temp.98280392");

        System.out.println("1 " + absoluto01.relativize(absoluto03));
        System.out.println("2 " + absoluto03.relativize(absoluto01));
        System.out.println("3 " + absoluto01.relativize(absoluto02));
        System.out.println("4 " + absoluto01.relativize(relativo01));
        System.out.println("5 " + absoluto01.relativize(relativo02));
    }
}
