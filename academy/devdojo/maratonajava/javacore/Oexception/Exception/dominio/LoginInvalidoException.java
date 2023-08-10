package academy.devdojo.maratonajava.javacore.Oexception.Exception.dominio;

public class LoginInvalidoException extends Exception{
    //Jesus

    public LoginInvalidoException() {
        super("Login inválido!");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
