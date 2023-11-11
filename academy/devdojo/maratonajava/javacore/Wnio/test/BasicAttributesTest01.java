package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicAttributesTest01 {
    //Jesus é maravilhoso!!!!
    public static void main(String[] args) throws IOException {
        File arquivo = new File("pasta/subpasta/novo.txt");
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        boolean isCreated = arquivo.createNewFile();
        boolean isModified = arquivo.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("pasta/subpasta/novo_novo.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isHidden(path));
        System.out.println(Files.isReadable(path));
    }
}
