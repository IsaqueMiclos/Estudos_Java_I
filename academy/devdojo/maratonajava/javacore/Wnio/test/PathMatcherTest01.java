package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    //Jesus é muito bom!!!
    public static void main(String... args) {
        Path p1 = Paths.get("pasta/subpasta/subsubsubpasta/arquivo.bkp");
        Path p2 = Paths.get("pasta/subpasta/subsubsubpasta/arquivo.java");
        Path p3 = Paths.get("pasta/subpasta/subsubsubpasta/arquivo.txt");
        matches(p1,"glob:*.bkp");
        matches(p1,"glob:**/*.bkp");
        matches(p1,"glob:**/*.{bkp,txt,java}");
        matches(p2,"glob:**/*.{bkp,txt,java}");
        matches(p3,"glob:**/*.{bkp,txt,java}");
        matches(p1, "glob:**/*.???");
        matches(p2, "glob:**/*.???");
        matches(p3, "glob:**/*.???");
        matches(p2, "glob:**/arquivo.????");
        matches(p2, "glob:**/arquivo02.????");
    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + " : " + matcher.matches(path));
    }

}
