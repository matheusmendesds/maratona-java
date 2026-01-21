package academy.devdojo.maratonajava.javacore.ZZClambdas.dominio;

public class Anime {
    private String title;
    private Integer episodes;

    public Anime(String title, Integer quantity) {
        this.title = title;
        this.episodes = quantity;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Integer getEpisodes() {
        return episodes;
    }
}
