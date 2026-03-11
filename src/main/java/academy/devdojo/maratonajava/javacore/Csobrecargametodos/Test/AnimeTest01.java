package academy.devdojo.maratonajava.javacore.Csobrecargametodos.Test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setTipo("TV");
//        anime.setEpisodios(13);
        anime.init("Naruto","TV",128);
        anime.init("Naruto  Shippuden","TV",128,"Ação");
        anime.imprime();
    }
}
