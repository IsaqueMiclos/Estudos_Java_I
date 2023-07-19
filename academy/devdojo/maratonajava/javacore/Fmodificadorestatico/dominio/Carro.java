package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    //Jesus é o caminho, a verdade e a vida!!!
    private String name;
    private double maxVelocity;
    private static double permVelocity = 250;

    public Carro(String name, double maxVelocity) {
        this.name = name;
        this.maxVelocity = maxVelocity;
    }

    public void empress() {
        System.out.println("------------");
        System.out.println("Name: " + this.name);
        System.out.println("Max Velocity: " + this.maxVelocity);
        System.out.println("Perm Velocity: " + Carro.permVelocity);
    }

    public static void setPermVelocity(double permVelocity) {
        Carro.permVelocity = permVelocity;
    }

    public static double getPermVelocity() {
        return Carro.permVelocity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }
}
