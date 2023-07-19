package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    //Jesus é o caminho, a verdade e a vida
    public static void main(String[] args) {
        //Imprima o dia da semana, sendo 1 como domingo
        byte diaDaSemana = 10;
        switch (diaDaSemana){
            default:
                System.out.println("Dia inválido");
                break;
            case 1 :
                System.out.println("DOMINGO");
                break;
            case 2 :
                System.out.println("SEGUNDA");
                break;
            case 3 :
                System.out.println("TERÇA");
                break;
            case 4 :
                System.out.println("QUARTA");
                break;
            case 5 :
                System.out.println("QUINTA");
                break;
            case 6 :
                System.out.println("SEXTA");
                break;
            case 7 :
                System.out.println("SÁBADO");
                break;
        }

        char sex = 'M';

        switch (sex){
            default:
                System.out.println("Sexo inválido");
                break;
            case 'F' :
                System.out.println("Senhorita");
                break;
            case 'M' :
                System.out.println("Senhor");
                break;
        }
    }
}
