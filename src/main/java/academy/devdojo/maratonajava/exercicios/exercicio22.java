package academy.devdojo.maratonajava.exercicios;
import  java.util.Scanner;
public class exercicio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro numero:");
        double x = Integer.parseInt(scanner.nextLine());
        System.out.println("Dividido por:");
        double y = Integer.parseInt(scanner.nextLine());
        double z = x/y;
        double resto = x%y;
        System.out.println("O quociente de "+ x +" divido por "+ y + " é = "+ z);
        System.out.println("O resto de "+ x +" divido por "+ y + " é = "+ resto);
    }
}
