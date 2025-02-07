package academy.devdojo.maratonajava.exercicios;

public class exercicio9 {
//    9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
//    de acordo com a tabela abaixo: Fórmula do IMC = peso / (altura) ²
//    Abaixo de 18,5   | Abaixo do peso
//    Entre 18,6 e 24,9 | Peso ideal (parabéns)
//    Entre 25,0 e 29,9 | Levemente acima do peso
//    Entre 30,0 e 34,9 | Obesidade grau I
//    Entre 35,0 e 39,9 | Obesidade grau II (severa)
//    Maior ou igual a 40 | Obesidade grau III (mórbida)

    public static void main(String[] args) {
        double altura = 1.56;
        double peso =76;
        double imc =  peso/(altura*altura);
        System.out.println("Seu IMC é: " + imc);
        if ( imc <= 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if ( imc >= 18.6 && imc <= 24.9){
            System.out.println("Você está em seu peso ideal");
        } else if ( imc >= 25.0 && imc <= 29.9){
            System.out.println("Você esta levemente acima do peso");
        } else if ( imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade grau I");
        } else if ( imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }

    }
}
