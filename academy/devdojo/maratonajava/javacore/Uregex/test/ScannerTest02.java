package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    //para Jesus
    public static void main(String... args) {
        String text = "Luffy,Zoro,Nami,Usopp";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");
        
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
