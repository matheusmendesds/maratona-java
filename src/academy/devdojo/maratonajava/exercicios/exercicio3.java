package academy.devdojo.maratonajava.exercicios;

public class exercicio3 {
    public static void main(String[] args) {

        System.out.println("---------------------");
        //3-Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
        //caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
        //imprimir seu valor na tela.
        int num = 4;
        int num2 = 5;
        if(num == num2){
            int res = num + num2;
            System.out.println("Resultado da soma: " + res);
        } else {
            int res = num * num2;
            System.out.println("Resultado da multiplicação: " + res);
        }
    }
}
