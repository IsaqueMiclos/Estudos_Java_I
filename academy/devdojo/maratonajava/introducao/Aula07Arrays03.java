package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = new int[]{1,2,3,4,5};
        int[] numeros3 = {5,4,3,2,1};

//        for (int i = 0; i < numeros3.length; i++) {
//            System.out.println(numeros3[i]);
//        }

        for (int num:numeros3) {
            System.out.println(num);
        }

        String[] names = new String[]{"Goku","Korusaki","Luffy"};
        for (String name:names){
            System.out.println(name);
        }
    }
}
