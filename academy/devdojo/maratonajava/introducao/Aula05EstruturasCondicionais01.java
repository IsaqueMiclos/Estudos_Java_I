package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 16;
        boolean isAutorizadoAComprarBebidaAlcolica = idade >= 18;

        // !

        if (isAutorizadoAComprarBebidaAlcolica) {
            System.out.println("VOCÊ ESTÁ AUTORIZADO!");
        } else {
            System.out.println("VOCÊ NÂO ESTA AUTORIZADO!!!");
        }
    }
}
