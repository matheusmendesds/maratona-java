package academy.devdojo.maratonajava.exercicios.calculadora;

public class Calculadora {
    public void calcularMedia(double[] notas){
        double soma = 0;
        for (double num : notas) {
            soma += num;

        }
        double media = soma/3;
        System.out.println("A media de notas é: " + media);
    }

    public void calcularAprovacao(double[] notas){
        double soma = 0;
        for (double num : notas) {
            soma += num;

        }
        double media = soma/4;
        if (media >= 7.0){
            System.out.println("A média do aluno foi: " + media + " resultado:Aprovado");
        } else {
            System.out.println("A média do aluno foi: " + media + " resultado:Reprovado");
        }

    }
}
