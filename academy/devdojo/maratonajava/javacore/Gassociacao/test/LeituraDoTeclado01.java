package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = entrada.nextLine();
        System.out.println("Digite a sua idade");
        int idade = entrada.nextInt();
        System.out.println("Digite o seu sexo");
        char sexo = entrada.next().charAt(0);
        System.out.println("-- Seus dados:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
