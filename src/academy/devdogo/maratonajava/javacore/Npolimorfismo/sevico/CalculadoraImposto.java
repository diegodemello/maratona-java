package academy.devdogo.maratonajava.javacore.Npolimorfismo.sevico;

import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Calculando o imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
