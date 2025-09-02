package academy.devdojo.maratonajava.projetosTreino.calculadora.test;

import academy.devdojo.maratonajava.projetosTreino.calculadora.servicos.Calculadora;

import java.util.Scanner;

public class operacaoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.println("Digite o primeiro numero:");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o segundo número");
        int n2 = Integer.parseInt(scanner.nextLine());

        calculadora.operacao(n1,n2);
    }
}
