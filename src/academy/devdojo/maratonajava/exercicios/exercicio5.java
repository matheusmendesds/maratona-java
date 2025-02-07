package academy.devdojo.maratonajava.exercicios;

public class exercicio5 {
    public static void main(String[] args) {
        //5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
        //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
        double salMin = 1293.20;
        double salUs = 4000;
        double qtdSalMin = salUs / salMin;
        String result = String.format("%.2f", qtdSalMin);
        System.out.println("O salario de " + salUs + " da um total de " + result + " salario minimo");
    }
}
