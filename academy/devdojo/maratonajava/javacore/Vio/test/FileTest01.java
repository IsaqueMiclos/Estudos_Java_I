package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;

public class FileTest01 {
    //toda honra e glória seja dada a Jesus
    public static void main(String[] args) {
        File file = new File("file.txt");
        
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Is Created " + isCreated);
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Exists "+exists);
                boolean isDeleted = file.delete();
                System.out.println("Is deleted " + isDeleted);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
