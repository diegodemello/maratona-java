package academy.devdogo.maratonajava.javacore.Npolimorfismo.sevico;

import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor do computador: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor do tomate: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
