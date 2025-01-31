package academy.devdogo.maratonajava.javacore.Bintrometodos.test;

import academy.devdogo.maratonajava.javacore.Bintrometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 12;

        Calculadora calculadora = new Calculadora();

        calculadora.alteraDoisNumeros(num1, num2);
    }
}
