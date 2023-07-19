package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        Carro c1 = new Carro("Bmw", 199);
        Carro c2 = new Carro("Dodge", 280);
        Carro c3 = new Carro("Ram", 210);

        Carro.setPermVelocity(199);

        double velocidadeLimite = Carro.getPermVelocity();
        System.out.println(velocidadeLimite);

        c1.empress();
        c2.empress();
        c3.empress();
    }
}
