package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.a.Calculadora;

public class exercicio19 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num = 1;
        do {
            calculadora.tabuada(num);
            num++;
        } while (num <=10);
    }
}
