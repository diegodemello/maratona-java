package academy.devdogo.maratonajava.javacore.Hheranca.test;

import academy.devdogo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdogo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdogo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("11570321");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Diego");
        pessoa.setCpf("451.264.117-54");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("---------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Eva");
        funcionario.setCpf("484.617.221-24");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3125);

        funcionario.imprime();
    }
}
