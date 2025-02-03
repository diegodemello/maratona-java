package academy.devdogo.maratonajava.javacore.Gassociacao.test;

import academy.devdogo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdogo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar JR");
        Time time = new Time("Santos F.C.");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
