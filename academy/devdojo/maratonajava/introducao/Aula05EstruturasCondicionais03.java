package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar salario > 5000
        float salario = 5000F;
        String resultadoSePossoDoar = salario > 5000 ? "Eu posso doar 500 pro DevDojo" : "Eu ainda não tenho condições de doar, mas terei!";
        boolean possoDoar = salario > 5000;
        // (condição) ? verdadeiro : falso

        System.out.println(resultadoSePossoDoar);
        System.out.println("Posso doar " + possoDoar);
    }
}
