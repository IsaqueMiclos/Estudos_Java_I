package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    //Jesus é o caminho, a verdade e a vida
    public static void main(String[] args) {
        byte dia = 2;
        switch (dia) {
            default :
                System.out.println("DIA INVÁLIDO");
                break;
            case 1 :
            case 7 :
                System.out.println("Final de Semana");
                break;
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
                System.out.println("Dia Útil");
                break;
        }
    }
}
