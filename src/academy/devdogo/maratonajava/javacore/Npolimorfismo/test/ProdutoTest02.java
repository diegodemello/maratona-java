package academy.devdogo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("MacBook Air 2018", 14000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("---------------------------");

        Produto produto2 = new Tomate("Tomate Cereja", 5);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
