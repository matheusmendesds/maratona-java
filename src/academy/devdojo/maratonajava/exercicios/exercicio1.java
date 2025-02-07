package academy.devdojo.maratonajava.exercicios;

public class exercicio1 {
    public static void main(String[] args) {
        System.out.println("---------------------");
        //1-Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
        int a = 1;
        int b = 2;
        int c = 6;
        int soma = a + b;
        if (soma >= c) {
            System.out.println("A soma de a + b é " + soma + " e é maior ou igual que " + c);
        } else {
            System.out.println("A soma de a + b é " + soma + " é menor que " + c);
        }

    }
}
