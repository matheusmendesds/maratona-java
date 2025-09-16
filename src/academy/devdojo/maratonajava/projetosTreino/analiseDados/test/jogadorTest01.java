package academy.devdojo.maratonajava.projetosTreino.analiseDados.test;

import academy.devdojo.maratonajava.projetosTreino.analiseDados.dominio.Clube;
import academy.devdojo.maratonajava.projetosTreino.analiseDados.dominio.Jogador;

public class jogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Neymar",35,10,12,24,12,200);
        Jogador jogador02 = new Jogador("Rollheiser",25,10,12,10,5,340);
        Jogador jogador03 = new Jogador("Bontempo",21,23,2,15,4,260);
        Clube time01 = new Clube("Santos Fc", 1912);
        jogador01.setClube(time01);
        jogador02.setClube(time01);
        jogador03.setClube(time01);

        jogador01.imprime();
        jogador02.imprime();
        jogador03.imprime();

        time01.listarJogadores();

    }
}
