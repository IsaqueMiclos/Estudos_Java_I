package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    //Jesus é o meu professor de Java!!!
    public static void main(String[] args) {
        Path diretorio = Paths.get(".");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(diretorio)) {
            for (Path path : stream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
