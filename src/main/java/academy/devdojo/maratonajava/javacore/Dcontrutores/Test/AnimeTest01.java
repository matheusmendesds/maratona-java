package academy.devdojo.maratonajava.javacore.Dcontrutores.Test;


import academy.devdojo.maratonajava.javacore.Dcontrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece","TV",122,"Ação","Studios Naruto");
//        anime.setTipo("TV");
//        anime.setEpisodios(13);

        anime.imprime();
    }
}
