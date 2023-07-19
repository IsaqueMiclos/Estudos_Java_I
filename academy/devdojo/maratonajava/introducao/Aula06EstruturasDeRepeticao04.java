package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //Jesus é o caminho, a verdade e a vida!
    public static void main(String[] args){
        double valorDoCarro = 80000;

        for (int parcela = 2; parcela <= valorDoCarro; parcela++) {
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela de " + parcela + "x de " + "R$ " + valorParcela + ";");
        }
    }
}
