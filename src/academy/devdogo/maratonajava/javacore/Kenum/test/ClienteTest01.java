package academy.devdogo.maratonajava.javacore.Kenum.test;

import academy.devdogo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdogo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Diego", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Ogeid", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1.toString());
        System.out.println(cliente3.toString());
    }
}
