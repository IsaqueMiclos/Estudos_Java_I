package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindJavaOrClassArquives extends SimpleFileVisitor<Path> {
    private final PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test01}.java");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (pathMatcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {
    //Jesus é o meu professor
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        Files.walkFileTree(path,new FindJavaOrClassArquives());
    }
}
