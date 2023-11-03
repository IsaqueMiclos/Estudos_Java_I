package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;

public class FileTest02 {
    //Jesus é bom o tempo todo e o tempo todo ele é bom!!!
    public static void main(String[] args) {
        File diretorio = new File("pasta");
        boolean isDiretoryCreated = diretorio.mkdir();
        System.out.println("O diretorio foi criado? " + isDiretoryCreated);

        File arquivoNovo = new File(diretorio,"arquivo.txt");
        try {
            boolean isArquivoCriado = arquivoNovo.createNewFile();
            System.out.println("O arquivo.txt foi criado? " + isArquivoCriado);
        } catch (Exception e) {
            e.printStackTrace();
        }

        File arquivoRenomeado = new File(diretorio,"arquivo_renomeado.txt");
        boolean isArquiveRenamed = arquivoNovo.renameTo(arquivoRenomeado);
        System.out.println("O arquivo.txt foi renomeado? " + isArquiveRenamed);

        File diretorioRenomeado = new File("pasta02");
        boolean isDiretoryRenamed = diretorio.renameTo(diretorioRenomeado);
        System.out.println("O diretorio foi renomeado? " + isDiretoryRenamed);
    }
}
