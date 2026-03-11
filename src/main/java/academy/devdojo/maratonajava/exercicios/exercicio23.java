package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.a.Calculadora;

import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Valor hora aula:");
        int valorAula = Integer.parseInt(scanner.nextLine());
        System.out.println("Aulas leccionadas:");
        int aulasDadas = Integer.parseInt(scanner.nextLine());

        calculadora.calcularSalario(aulasDadas,valorAula);

    }
}
