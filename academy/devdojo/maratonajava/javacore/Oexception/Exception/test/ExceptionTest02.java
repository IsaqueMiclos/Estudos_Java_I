package academy.devdojo.maratonajava.javacore.Oexception.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    //Jesus é Bom
    public static void main(String[] args) throws IOException {
        CriarUmNovoArquivo();
    }

    private static void CriarUmNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);
        } catch (IOException ex){
            ex.printStackTrace();
            throw ex;
        }
    }
}
