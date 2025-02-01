package academy.devdogo.maratonajava.javacore.Bintrometodos.test;

import academy.devdogo.maratonajava.javacore.Bintrometodos.dominio.Calculadora;

public class CalculadoraTeste07 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int numero = 88;
        System.out.println(calculadora.numeroPrimo(numero));
    }
}
