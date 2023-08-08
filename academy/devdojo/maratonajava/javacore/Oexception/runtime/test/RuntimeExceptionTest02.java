package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        //Jesus é bom, ele é o meu professor de Java
        divisao(1,0);

    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divisao(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Isso é ilegal, nada é divisível por 0!");
        }

        return a/b;
    }
}
