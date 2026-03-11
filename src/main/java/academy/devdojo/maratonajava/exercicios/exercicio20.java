package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.a.Calculadora;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero");
        int num = Integer.parseInt(scanner.nextLine());

        Calculadora calculadora = new Calculadora();
        calculadora.tabuada(num);
        scanner.close();
    }
}
