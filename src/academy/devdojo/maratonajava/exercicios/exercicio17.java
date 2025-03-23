package academy.devdojo.maratonajava.exercicios;
import java.util.Scanner;
public class exercicio17 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura
        //correspondente em grau Celsius. Imprima na tela as duas temperaturas.
        //Fórmula: C = (5 * ( F-32) / 9)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura em Fahrenheit");
        int fahr = Integer.parseInt(scanner.nextLine());

        int cels = (5 * (fahr-32)/9);

        System.out.println("A temperatura em fahrenheit : "+ fahr +"ºF");
        System.out.println("A temperatura em celsius : "+ cels +"ºC");

        scanner.close();
    }
}
