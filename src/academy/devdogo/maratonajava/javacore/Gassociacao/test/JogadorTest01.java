package academy.devdogo.maratonajava.javacore.Gassociacao.test;

import academy.devdogo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Guilherme");
        Jogador jogador3 = new Jogador("Tiquinho");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
