package academy.devdogo.maratonajava.javacore.GassociacaoExercicio3.test;

import academy.devdogo.maratonajava.javacore.GassociacaoExercicio3.dominio.Cliente;
import academy.devdogo.maratonajava.javacore.GassociacaoExercicio3.dominio.Conta;

public class ContaBancaria {
    public static void main(String[] args) {
        Conta conta = new Conta(4128, 20);
        Cliente cliente = new Cliente("Diego", 20, "49796477823", conta);

        cliente.getConta().deposito(200);

        cliente.imprime();
    }
}
