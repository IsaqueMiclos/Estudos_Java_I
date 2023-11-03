package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;

public class FileReaderTest01 {
    //Jesus é o Rei!!!
    
    public static void main(String[] args) {
        File file = new File("file.txt");
        
        try (FileReader fR = new FileReader(file)) {
            int i;

            while ((i = fR.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
