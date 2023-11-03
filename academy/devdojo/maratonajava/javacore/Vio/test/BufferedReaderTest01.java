package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderTest01 {
    //Jesus é o Rei!!!
    
    public static void main(String[] args) {
        File file = new File("file.txt");
        
        try (FileReader fR = new FileReader(file);
        BufferedReader br = new BufferedReader(fR)) {
            String text;
            while ((text = br.readLine()) != null) {
                System.out.println(text);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
