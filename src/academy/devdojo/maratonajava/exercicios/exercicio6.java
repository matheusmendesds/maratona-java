package academy.devdojo.maratonajava.exercicios;

public class exercicio6 {
    public static void main(String[] args) {
        //6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
        int num = 1900;
        int res = num + (num * 5/100);
        System.out.println("O numero " + num + " com reajuste de 5% ficará em " + res);
    }
}
