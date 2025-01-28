package academy.devdogo.maratonajava.javacore.Aintroclass.test;

import academy.devdogo.maratonajava.javacore.Aintroclass.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Gilmar";
        professor.idade = 38;
        professor.sexo = 'M';

        System.out.println("O nome do professor é " + professor.nome + ", sua idade é " + professor.idade + " e seu sexo é " + professor.sexo);
    }
}