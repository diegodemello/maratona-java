package academy.devdogo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdogo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 39);
        anime.init("Naruto", "TV", 39, "Ação");
        anime.imprime();
    }
}
