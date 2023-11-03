package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    //Jesus é maravilhoso!
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write("Luffy sola geral bro \n");
            fw.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
