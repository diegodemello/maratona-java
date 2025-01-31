package academy.devdogo.maratonajava.javacore.Bintrometodos.test;

import academy.devdogo.maratonajava.javacore.Bintrometodos.dominio.Funcionario;
import academy.devdogo.maratonajava.javacore.Bintrometodos.dominio.FuncionarioMedia;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        FuncionarioMedia media = new FuncionarioMedia();

        funcionario.nome = "Diego";
        funcionario.idade = 20;
        funcionario.salarios[0] = 1306.15;
        funcionario.salarios[1] = 1404.04;
        funcionario.salarios[2] = 2415.58;

        funcionario.imprimirDados();
        media.mediaSalarial(funcionario);
    }
}
