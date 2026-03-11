package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(m-> m.setTitle("Boku no hero 2"));
        System.out.println(mangaByTitle);

        MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElse(new Manga(3, "Drifters", 55));
        System.out.println(newManga);
    }
}
