package academy.devdojo.maratonajava.javacore.Oexception.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    //Jesus é Bom
    public static void main(String[] args) {
        CriarUmNovoArquivo();
    }

    private static void CriarUmNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
