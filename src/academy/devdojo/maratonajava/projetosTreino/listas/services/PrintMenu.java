package academy.devdojo.maratonajava.projetosTreino.listas.services;

import java.util.Scanner;

public class PrintMenu {
    public int menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Criar Time");
        System.out.println("2-Adicionar Jogador");
        System.out.println("3-Editar");
        System.out.println("4-Ver Times");
        System.out.println("5-Sair");
        int escolha = scanner.nextInt();
        return escolha;
    }
}
