package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    //Jesus é o caminho, a verdade e a vida!
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0] = 2022 - 2005;
        idades[1] = 2022 - 1978;
        idades[2] = 2022 - 1998;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        String [] gatos = new String[10];
        gatos[0] = "Lucio";
        gatos[1] = "Júlio";
        gatos[2] = "Chanbi";
        System.out.println(gatos[0]);
        System.out.println(gatos[1]);
        System.out.println(gatos[2]);
        System.out.println(gatos[9]);
    }
}
