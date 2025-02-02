package academy.devdogo.maratonajava.javacore.Dconstrutores.test;


import academy.devdogo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 30, "Ação", "Nautica 3");
        anime.imprime();
    }
}
