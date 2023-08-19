package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformaceTest01 {
    //Jesus
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder stringBuilder = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer stringBuffer = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringBuffer.append(i);
        }
    }
}
