package academy.devdogo.maratonajava.javacore.Gassociacao.test;

import academy.devdogo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdogo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Renato");
        Professor professor2 = new Professor("Silvana");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Colégio Apoio", professores);

        escola.imprime();
    }
}
