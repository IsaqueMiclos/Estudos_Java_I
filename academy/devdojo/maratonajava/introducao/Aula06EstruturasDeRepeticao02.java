package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        int count = 0;

        for (count = 1; count <= 1000000; count++){
            if (count % 2 == 0) {
                System.out.println(count + " Par");
            }
        }
    }
}
