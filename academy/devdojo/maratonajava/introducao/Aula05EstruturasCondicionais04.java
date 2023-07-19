package academy.devdojo.maratonajava.introducao;

//Jesus é o caminho, a verdade e a vida

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 5000;
        String notaFinal;

        if (salarioAnual < 34712) {
            double resultadoDoValor = salarioAnual * 0.097;
            notaFinal = "O valor do seu imposto a ser pago é: "+resultadoDoValor;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            double resultadoDoValor = salarioAnual * 0.3735;
            notaFinal = "O valor do seu imposto a ser pago é: "+resultadoDoValor;
        } else {
            double resultadoDoValor = salarioAnual * 0.4950;
            notaFinal = "O valor do seu imposto a ser pago é: "+resultadoDoValor;
        }
        System.out.println(notaFinal);
    }
}
