package academy.devdojo.maratonajava.projetosTreino.listas.test;

import academy.devdojo.maratonajava.projetosTreino.listas.dominio.Jogador;
import academy.devdojo.maratonajava.projetosTreino.listas.dominio.Time;

import java.util.ArrayList;
import java.util.List;

public class test01 {
    public static void main(String[] args) {
        Time time1 = new Time("Santos FC", "Brasil");
        Time time2 = new Time("Real Madrid", "Espanha");
        Time time3 = new Time("Milan", "Italia");
        List<Time> times = new ArrayList<>();
        times.add(time1);
        times.add(time2);
        times.add(time3);
        Jogador j1 = new Jogador("Neymar JR", 33, time1);
        System.out.println(j1);
        System.out.println(times);
    }
}
