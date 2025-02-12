package academy.devdogo.maratonajava.javacore.Kenum.test;

import academy.devdogo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdogo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdogo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Diego", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Ogeid", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente3);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
