package academy.devdojo.maratonajava.projetosTreino.listas.test;

import academy.devdojo.maratonajava.projetosTreino.listas.dominio.Jogador;
import academy.devdojo.maratonajava.projetosTreino.listas.dominio.Time;

public class test01 {
    public static void main(String[] args) {
        Time santos = new Time("Santos FC","Brasil");
        Jogador j1 = new Jogador("Neymar JR",33,santos);
        System.out.println(j1);
    }
}
