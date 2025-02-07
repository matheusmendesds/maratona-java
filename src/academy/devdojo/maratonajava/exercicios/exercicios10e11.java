package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.calculadora.Calculadora;

public class exercicios10e11 {
//    10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
//    11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
//    se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

    public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();

    double[] notas = new double[]{8.2,9.2,9.0};
    double[] notas2 = new double[]{8.5,9.2,7.0,9.0};
    calculadora.calcularMedia(notas);
    calculadora.calcularMedia(notas2);



}
}
