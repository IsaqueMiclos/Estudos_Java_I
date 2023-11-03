package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    //Jesus é maravilhoso
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundleTest = ResourceBundle.getBundle("mensagem", new Locale("pt", "BR"));
    
        System.out.println(bundleTest.getString("hello"));
        System.out.println(bundleTest.getString("good.morning"));

        bundleTest = ResourceBundle.getBundle("mensagem", new Locale("en", "US"));
    
        System.out.println(bundleTest.getString("hello"));
        System.out.println(bundleTest.getString("good.morning"));
    }
}
