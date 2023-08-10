package academy.devdojo.maratonajava.javacore.Oexception.Exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.Exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginTest01 {
    //Jesus é o máximo
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String username = "saitama";
        String senha = "0828";

        System.out.println("Usuário: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = teclado.nextLine();

        if (!username.equals(usernameDigitado) || !senha.equals(senhaDigitada)){
            throw new LoginInvalidoException("Senha ou Usuário incorretos!!!");
        }

        System.out.println("Usuário Logado com sucesso!");
    }
}
