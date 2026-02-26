package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
    private final Set<String> availabeSeats = new HashSet<>();
    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    {
        availabeSeats.add("1A");
        availabeSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availabeSeats.remove(seat);
    }

    public String getName() {
        return name;
    }
}
