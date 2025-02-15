package academy.devdogo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.sevico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MacBook", 20000);
        Tomate tomate = new Tomate("Tomate cereja", 2);
        Televisao tv = new Televisao("Smart TV 50\" ", 2500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
