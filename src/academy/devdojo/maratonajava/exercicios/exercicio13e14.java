package academy.devdojo.maratonajava.exercicios;

public class exercicio13e14 {
    //13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
    public static void main(String[] args) {
        //13
        String nome = "João";
        int idade = 10;
        if (idade > 17) {
            System.out.println("Nome : " + nome + " e é Maior de idade");
        } else {
            System.out.println("Nome : " + nome + " e é Menor de idade");
        }
        //14
        int a = 29;
        int b = 30;
        System.out.println("A é igual: " + a + " e B é igual: " + b );
        b = a;
        a = b;
        System.out.println("Agora A é = " + a + " e B = " + b );

    }
}
