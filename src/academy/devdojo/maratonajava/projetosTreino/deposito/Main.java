package academy.devdojo.maratonajava.projetosTreino.deposito;

import academy.devdojo.maratonajava.projetosTreino.deposito.produtos.Eletronico;
import academy.devdojo.maratonajava.projetosTreino.deposito.produtos.Fruta;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Fruta maca = new Fruta("Maça Gala", 4.50,1000);
        Eletronico celular = new Eletronico("Iphone",6000,300);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estoque");
        System.out.println("1-Adicionar Produtos");
        System.out.println("2-Remover Produtos");
        System.out.println("3-Sair");
        int escolha = scanner.nextInt();
        switch (escolha){
            case 1:
                System.out.println("Adicione o produto");
                break;
            case 2:
                System.out.println("Remova o produto");
                break;
            case 3:
                System.out.println("Saindo");
                break;
            default:
                System.out.println("Solicitação invalida");
                break;
        }
    }
}
