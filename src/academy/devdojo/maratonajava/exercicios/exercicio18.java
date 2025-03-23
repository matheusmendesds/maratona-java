package academy.devdojo.maratonajava.exercicios;

public class exercicio18 {
    //Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara
    //tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que
    //calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
    public static void main(String[] args) {
        int sara = 110;
        int fran = 150;
        int ano = 0;
        do {
            sara += 3;
            fran += 1;
            ano++;

        } while (fran >= sara);
        System.out.println("Franscisco tem 1,50cm e Sara tem 1,10");
        System.out.println("Serão necessários " + ano + " anos para que Sara seja maior que Francisco");
    }
}
