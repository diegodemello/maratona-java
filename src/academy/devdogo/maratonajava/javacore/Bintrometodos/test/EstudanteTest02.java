package academy.devdogo.maratonajava.javacore.Bintrometodos.test;

import academy.devdogo.maratonajava.javacore.Bintrometodos.dominio.Estudantes;
import academy.devdogo.maratonajava.javacore.Bintrometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudantes estudantes01 = new Estudantes();
        Estudantes estudantes02 = new Estudantes();

        estudantes01.nome = "Diego";
        estudantes01.idade = 20;
        estudantes01.sexo = 'M';

        estudantes02.nome = "Leandro";
        estudantes02.idade = 24;
        estudantes02.sexo = 'M';

        estudantes01.imprime();
        estudantes02.imprime();
    }
}
