package academy.devdogo.maratonajava.javacore.Bintrometodos.test;

import academy.devdogo.maratonajava.javacore.Bintrometodos.dominio.Funcionario;
import academy.devdogo.maratonajava.javacore.Bintrometodos.dominio.FuncionarioMedia;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        FuncionarioMedia media = new FuncionarioMedia();

        funcionario.nome = "Diego";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{1404, 1680, 17203, 2550, 4800};

        funcionario.imprimirDados();
        media.mediaSalarial(funcionario);
    }
}
