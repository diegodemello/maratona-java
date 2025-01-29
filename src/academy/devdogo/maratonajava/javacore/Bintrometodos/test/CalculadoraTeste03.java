package academy.devdogo.maratonajava.javacore.Bintrometodos.test;

import academy.devdogo.maratonajava.javacore.Bintrometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double divisao = calculadora.divideDoisNumeros(4, 2);
        System.out.println(divisao);

        calculadora.imprimiDivisaoDeDoisNumeros(10, 0);
    }
}
