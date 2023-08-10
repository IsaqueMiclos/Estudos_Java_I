package academy.devdojo.maratonajava.javacore.Oexception.Exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor01 implements Closeable {
    //Jesus é bom demais

    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 01");
    }
}
