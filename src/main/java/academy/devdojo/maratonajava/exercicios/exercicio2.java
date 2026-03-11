package academy.devdojo.maratonajava.exercicios;

public class exercicio2 {
    public static void main(String[] args) {
        System.out.println("---------------------");
        // 2- Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        int num = -4 ;
        if (num%2==0){
            System.out.println("O número: " + num + " é par");
        } else {
            System.out.println("O número: " + num + " é impar");
        }
        if (num > 0 ) {
            System.out.println("O número: " + num + " é positivo");
        } else {
            System.out.println("O número: " + num + " é negativo");
        }
    }
}
