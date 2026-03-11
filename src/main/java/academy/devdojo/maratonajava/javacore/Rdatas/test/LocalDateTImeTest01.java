package academy.devdojo.maratonajava.javacore.Rdatas.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTImeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDate data = LocalDate.of(2022, Month.AUGUST,6);
        LocalDate dataParse = LocalDate.parse("2022-08-06");

        LocalTime time = LocalTime.of(9,45,21);
        LocalTime timeParse = LocalTime.parse("09:45:00");
        System.out.println(localDateTimeNow);
        System.out.println(time);
        System.out.println(data);
        LocalDateTime localDateTime1 = data.atTime(time);
        LocalDateTime localDateTime2 = time.atDate(data);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);


    }
}
