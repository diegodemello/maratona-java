package academy.devdogo.maratonajava.javacore.Bintrometodos.test;

import academy.devdogo.maratonajava.javacore.Bintrometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();

        int[] array = {20, 30, 40, 50};
        calculadora.somaArray(array);
        calculadora.somaVarargs(array);
    }
}
