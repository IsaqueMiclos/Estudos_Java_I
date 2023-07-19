package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    //Jesus é o caminho, a verdade e a vida
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[][] bonecos = new int[3][];

        bonecos[0] = new int[2];
        bonecos[1] = array;
        bonecos[2] = new int[]{1,2,3,4,5,6};

        int[][] bonecosVerdes = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};

        for (int[] arrayBase : bonecosVerdes) {
            for (int boneco : arrayBase) {
                System.out.print(boneco);
            }
        }
  }
}
