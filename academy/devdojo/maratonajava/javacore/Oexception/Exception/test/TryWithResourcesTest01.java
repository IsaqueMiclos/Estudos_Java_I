package academy.devdojo.maratonajava.javacore.Oexception.Exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.Exception.dominio.Leitor01;
import academy.devdojo.maratonajava.javacore.Oexception.Exception.dominio.Leitor02;

import java.io.*;

public class TryWithResourcesTest01 {
    //Jesus é bom
    public static void main(String[] args) {
        LerArquivo();
    }

    public static void LerArquivo() {
        try(Leitor01 leitor01 = new Leitor01();
            Leitor02 leitor02 = new Leitor02()){

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void LerArquivo2() {
        Reader leitor = null;
        try {
            leitor = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (leitor != null) {
                    leitor.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
