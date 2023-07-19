package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    //Jesus é o caminho, a verdade e a vida!
    public static void main(String[] args){
        double valorDoCarro = 45000;

        for (int parcela = (int) valorDoCarro; parcela >= 1; parcela--) {
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela de " + parcela + "x de " + "R$ " + valorParcela + ";");
        }
    }
}
