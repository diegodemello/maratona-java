package academy.devdogo.maratonajava.javacore.Aintroclass.test;

import academy.devdogo.maratonajava.javacore.Aintroclass.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Scania";
        carro1.modelo = "R 440 6x2";
        carro1.ano = 2018;

        carro2.nome = "Scania";
        carro2.modelo = "R 450 6x2";
        carro2.ano = 2019;

        System.out.println("Primeiro carro é da " + carro1.nome + ", modelo " + carro1.modelo + " de " + carro1.ano);
        System.out.println("Primeiro carro é da " + carro2.nome + ", modelo " + carro2.modelo + " de " + carro2.ano);
    }
}
