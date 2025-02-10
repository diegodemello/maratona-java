package academy.devdogo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdogo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdogo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdogo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Diego");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
