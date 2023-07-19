package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        // While, do While e For
        int counter = 0;
        while(counter < 10){
            System.out.println(++counter);
        }

        counter = 0;
        do {
            System.out.println("Dentro do do-while " + ++counter);
        } while (counter < 10);

        for (counter = 1; counter <= 10; counter++) {
            System.out.println("Loop FOR " + counter);
        }
    }
}
