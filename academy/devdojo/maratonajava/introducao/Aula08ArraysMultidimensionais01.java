package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    //Jesus é o caminho, a verdade e a vida
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("---------------------------");

        for (int[] arrBase : dias) {
            for (int dia : arrBase){
                System.out.println(dia);
            }
        }
    }
}
