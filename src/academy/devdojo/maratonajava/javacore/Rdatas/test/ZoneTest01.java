package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZOne = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZOne);
        //pegando horario/dia local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //colocando no zona de tokyo/asia
        ZonedDateTime zonedDateTime = now.atZone(tokyoZOne);
        System.out.println(zonedDateTime);

        //adicionando pelo instant onde ele ja soma a hora atual + da zona escolhida
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZOne);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        //transformando o datetime usando o fuso horario diretamente sem saber qual o nome
        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
