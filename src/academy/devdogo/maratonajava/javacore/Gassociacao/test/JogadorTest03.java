package academy.devdogo.maratonajava.javacore.Gassociacao.test;

import academy.devdogo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdogo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Tiquinho Soares");
        Jogador jogador2 = new Jogador("Soteldo");
        Time time = new Time("Santos F.C.");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        jogador.imprime();
        System.out.println("------------");
        time.imprime();
    }
}
