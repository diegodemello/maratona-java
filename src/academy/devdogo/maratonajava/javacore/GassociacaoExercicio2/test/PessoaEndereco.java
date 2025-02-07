package academy.devdogo.maratonajava.javacore.GassociacaoExercicio2.test;

import academy.devdogo.maratonajava.javacore.GassociacaoExercicio2.dominio.Endereco;
import academy.devdogo.maratonajava.javacore.GassociacaoExercicio2.dominio.Pessoa;

public class PessoaEndereco {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Diego", 20);
        Endereco endereco = new Endereco("Alberto Sá", 321, "21781-212");

        pessoa.setEndereco(endereco);

        pessoa.imprime();
    }
}
