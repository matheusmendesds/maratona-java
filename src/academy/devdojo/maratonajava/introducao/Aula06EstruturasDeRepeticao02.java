package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares ate 1 milhao
        int numero = 0;
        do {
            if (numero % 2 == 0 ){
                System.out.println(numero);


            }
            numero++;
        } while(numero <= 100000);
}}
