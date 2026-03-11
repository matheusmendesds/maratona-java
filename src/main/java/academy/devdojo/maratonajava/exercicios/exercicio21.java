package academy.devdojo.maratonajava.exercicios;
import java.util.Random;
public class exercicio21 {
    public static void main(String[] args) {
        Random random = new Random();

        int min = 1;
        int max = 100;

        int numAleatorio = random.nextInt(max - min + 1) + min;

        System.out.println("Número aleatório entre " + min + " e " + max + ": " + numAleatorio);
    }
}
