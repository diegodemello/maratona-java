package academy.devdogo.maratonajava.javacore.GassociacaoExercicio.test;

import academy.devdogo.maratonajava.javacore.GassociacaoExercicio.dominio.Aluno;
import academy.devdogo.maratonajava.javacore.GassociacaoExercicio.dominio.Seminario;

public class Exercicio {
    public static void main(String[] args) {
        Seminario seminario = new Seminario("Econtro de Gigantes");
        Aluno aluno = new Aluno("Diego", 20, seminario);

        aluno.imprime();
    }
}
