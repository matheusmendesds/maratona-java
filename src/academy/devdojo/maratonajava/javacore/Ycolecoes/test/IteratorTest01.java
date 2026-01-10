package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        //Usar o LinkedList é melhor para remoçao de itens na lista
        List<Manga> mangas = new LinkedList<>();

        mangas.add(new Manga(5L,"Hellsing Ultimate",19.9,0));
        mangas.add(new Manga(1L,"Berserk",9.5,5));
        mangas.add(new Manga(4L,"Pokemon",3.2,0));
        mangas.add(new Manga(3L,"Attack on Titan",11.20,2));
        mangas.add(new Manga(2L,"Dragon Ball z",2.99,0));

        //Forma de remover itens da lista usando Iterator
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if(mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }
//        System.out.println(mangas);


        //Forma nova do java para remover itens com removeIf
        mangas.removeIf(manga -> manga.getQuantidade() == 00);
        System.out.println(mangas);
    }
}
