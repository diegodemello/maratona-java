package academy.devdogo.maratonajava.javacore.GassociacaoExercicio.test;

import academy.devdogo.maratonajava.javacore.GassociacaoExercicio.dominio.Aluno;
import academy.devdogo.maratonajava.javacore.GassociacaoExercicio.dominio.Local;
import academy.devdogo.maratonajava.javacore.GassociacaoExercicio.dominio.Professor;
import academy.devdogo.maratonajava.javacore.GassociacaoExercicio.dominio.Seminario;

public class SeminarioExercicio {
    public static void main(String[] args) {
        Local local = new Local("Av. Presidente Wilson");
        Aluno aluno = new Aluno("Diego", 20);
        Professor professor = new Professor("Rafael", "Especialista em Controladoria");
        Aluno[] alunosDoSeminario = {aluno};
        Seminario seminario = new Seminario("Encontro de Gigantes", alunosDoSeminario, local);
        Seminario[] seminariosDoProfessor = {seminario};
        professor.setSeminarios(seminariosDoProfessor);

        professor.imprime();
    }
}
