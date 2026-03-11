package academy.devdojo.maratonajava.exercicios;
import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro Lado do Triangulo");
        int ladoUm = Integer.parseInt(scanner.nextLine());

        System.out.println("Insira o segundo Lado do Triangulo");
        int ladoDois = Integer.parseInt(scanner.nextLine());

        System.out.println("Insira o terceiro Lado do Triangulo");
        int ladoTres = Integer.parseInt(scanner.nextLine());

       if(ladoTres == ladoDois && ladoUm == ladoTres ){
           System.out.println("Triâmgulo Equilatero");

       } else if (ladoTres != ladoDois && ladoDois != ladoUm && ladoTres != ladoUm){
           System.out.println("Triangulo Escaleno");
       } else {
            System.out.println("Triangulo Isósceles");
       }

       scanner.close();

    }
}
