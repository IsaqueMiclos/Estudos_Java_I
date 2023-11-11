package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFilesAttributesTest01 {
    //Jesus man
    public static void main(String... args) throws IOException {
        Path path = Paths.get("pasta/subpasta/teste.txt");
        if (Files.notExists(path)) {
            Files.createFile(path);
        }
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isReadOnly());
        System.out.println(dosFileAttributes.isHidden());

        DosFileAttributeView dosFileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        dosFileAttributeView.setReadOnly(true);
        dosFileAttributeView.setHidden(true);
        System.out.println(dosFileAttributeView.readAttributes().isReadOnly());
        System.out.println(dosFileAttributeView.readAttributes().isHidden());
    }
}
