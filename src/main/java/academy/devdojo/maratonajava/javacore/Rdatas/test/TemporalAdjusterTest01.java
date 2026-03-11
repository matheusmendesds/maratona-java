package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek) {
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //Verificando qnd é o proximo dia util com base no dia q fiz esse exercicio 19-09 sexta
        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println("Proximo dia util: "+now);
        System.out.println(now.getDayOfWeek());

        //Utilizando dia 18(quinta) para verficar prox dia util
        now = LocalDate.now().withDayOfMonth(18).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println("Proximo dia util: " +now.getDayOfWeek());

        // usando sabado e domingo 20 e 21 do 09 pra testar se esta certa a logica do switch
        now = LocalDate.now().withDayOfMonth(20).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println("Proximo dia util: " +now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(20).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println("Proximo dia util: " +now.getDayOfWeek());

    }
}
