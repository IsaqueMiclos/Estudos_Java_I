package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        // byte, short, float, double, int, long 0
        // char '\u0000' ' '
        // String null
        // boolean false
        String [] names = new String[3];
        names[0] = "Gohan";
        names[1] = "String";
        names[2] = "Zoro";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
