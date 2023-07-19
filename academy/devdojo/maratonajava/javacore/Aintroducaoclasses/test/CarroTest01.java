package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        Carro brasilia = new Carro();
        brasilia.nome = "VOLKSWAGEN BRASÍLIA";
        brasilia.ano = 1973;
        brasilia.modelo = "AZUL";

        Carro chevette = new Carro();
        chevette.ano = 1973;
        chevette.modelo = "PRETO";
        chevette.nome = "CHEVROLET CHEVETTE";

        System.out.println("Nome: " + brasilia.nome + " ano: " + brasilia.ano + " modelo: " + brasilia.modelo + ".");
        System.out.println("Nome: " + chevette.nome + " ano: " + chevette.ano + " modelo: " + chevette.modelo + ".");
    }
}
