package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicAttributesTest02 {
    //Jesus é o meu professor!
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/subpasta/novo_novo.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        System.out.println("creationTime " + creationTime);
        System.out.println("lastModifiedTime " + lastModifiedTime);
        System.out.println("lastAccessTime " + lastAccessTime);

        System.out.println("---------------");

        BasicFileAttributeView fileAttributesView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributesView.setTimes(lastModifiedTime,lastAccessTime,newCreationTime);

        creationTime = fileAttributesView.readAttributes().creationTime();
        lastAccessTime = fileAttributesView.readAttributes().lastAccessTime();
        lastModifiedTime = fileAttributesView.readAttributes().lastModifiedTime();

        System.out.println("creationTime " + creationTime);
        System.out.println("lastModifiedTime " + lastModifiedTime);
        System.out.println("lastAccessTime " + lastAccessTime);
    }

}
