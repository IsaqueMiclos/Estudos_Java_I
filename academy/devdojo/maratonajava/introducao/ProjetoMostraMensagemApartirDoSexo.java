package academy.devdojo.maratonajava.introducao;

public class ProjetoMostraMensagemApartirDoSexo {
    public static void main(String[] args) {
        char sexo = 'L';
        String mensage = "Olá senho";
        switch (sexo) {
            default :
                mensage = "Sexo Inválido!";
                break;
            case 'F' :
                mensage += "ra!";
                break;
            case 'M' :
                mensage += "r!";
                break;
        }
        System.out.println(mensage);
    }
}
