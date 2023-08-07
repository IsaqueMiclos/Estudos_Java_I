package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Monitor;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Pc;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;


public class ProdutoTest02 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        Produto produto = new Pc("RK9",11000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calculaTaxa());
        System.out.println("-------------------");

        Produto produto2 = new Monitor("KNZ007",1500);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calculaTaxa());
    }
}
