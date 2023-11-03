package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    //para Jesus
    public static void main(String... args) {
        String text = "Luffy, Zoro, Nami, Usopp";
        String[] formated = text.split(",");

        for (String name : formated) {
            System.out.println(name.trim());
        }
    }
}
