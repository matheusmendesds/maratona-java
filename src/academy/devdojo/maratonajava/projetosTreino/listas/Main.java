package academy.devdojo.maratonajava.projetosTreino.listas;

import academy.devdojo.maratonajava.projetosTreino.listas.services.AddJogador;
import academy.devdojo.maratonajava.projetosTreino.listas.services.CriarTime;
import academy.devdojo.maratonajava.projetosTreino.listas.services.EditarDados;
import academy.devdojo.maratonajava.projetosTreino.listas.services.PrintMenu;

public class Main {
    public static void main(String[] args) {
        PrintMenu menu = new PrintMenu();
        int escolha = menu.menuPrincipal();
        CriarTime addTime = new CriarTime();
        AddJogador addJogador = new AddJogador();
        EditarDados editDados = new EditarDados();
        switch (escolha){
            case 1:
                System.out.println("Escolha 1");
                addTime.creatingTeam();
                break;
            case 2:
                System.out.println("Escolha 2");
                break;
            case 3:
                System.out.println("Escolha 3");
                break;
            case 4:
                System.out.println("Escolha 4");
                break;
            case 5:
                System.out.println("Escolha 5");
                break;
            default:
                System.out.println("Escolha invalida");
                break;
        }
    }
}
