package academy.devdogo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.sevico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("MacBook Air 2018", 14000);
        Tomate tomate = new Tomate("Tomate Cereja", 5);
        tomate.setDataValidade("17/02/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
