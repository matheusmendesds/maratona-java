package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.a.Calculadora;

import java.util.Scanner;

public class exercicio24 {
    //Faça um algoritmo que calcule a quantidade de litros de
    //combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro.
    //Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média,
    //distância percorrida e a quantidade de litros utilizados para fazer a viagem.

    //Fórmula: distância = tempo x velocidade. litros usados = distância / 12.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.println("Insira a distãncia da viagem em KM:");
        int distancia = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira a velocidade média do carro na sua viagem:");
        int velocidade = Integer.parseInt(scanner.nextLine());

        calculadora.dadosViagem(distancia,velocidade);

    }
}
