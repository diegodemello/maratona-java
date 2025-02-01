package academy.devdogo.maratonajava.javacore.Bintrometodos.test;

import academy.devdogo.maratonajava.javacore.Bintrometodos.dominio.Calculadora;

public class CalculadoraTeste06 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = new int[]{1, 2, 3};
        calculadora.listaDuplicada(numeros);
    }
}
