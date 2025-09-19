package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario =  LocalDateTime.of(1998, Month.OCTOBER,16,19,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Dias entre data de nascimento e hoje: "+ChronoUnit.DAYS.between(aniversario,now));
        System.out.println("Semanas entre data de nascimento e hoje: "+ChronoUnit.WEEKS.between(aniversario,now));
        System.out.println("Meses entre data de nascimento e hoje: "+ChronoUnit.MONTHS.between(aniversario,now));
        System.out.println("Anos entre data de nascimento e hoje: "+ChronoUnit.YEARS.between(aniversario,now));

    }
}
