package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Attack on Titan");
        mangas.add("Dragon Ball z");
        mangas.add("Berserk");
        Collections.sort(mangas);
        for(String manga : mangas) {
            System.out.println(manga);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(20.8);
        dinheiros.add(15.4);
        dinheiros.add(10.2);
        dinheiros.add(9.2);

        Collections.sort(dinheiros);
        System.out.println(dinheiros);
    }
}
