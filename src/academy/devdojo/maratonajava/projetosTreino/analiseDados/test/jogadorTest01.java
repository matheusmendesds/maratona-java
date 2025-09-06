package academy.devdojo.maratonajava.projetosTreino.analiseDados.test;

import academy.devdojo.maratonajava.projetosTreino.analiseDados.dominio.Jogador;

public class jogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Neymar",35,10,20,24,12,200);
        // jogador01.calcularStats();
        Jogador jogador02 = new Jogador("Rollheiser",25,10,12,10,2,340);
        // jogador02.calcularStats();
        // jogador01.imprime();
        jogador01.analiseJogador();
        jogador02.analiseJogador();

    }
}
