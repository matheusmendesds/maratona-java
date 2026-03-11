package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    //while , do while , for
    public static void main(String[] args) {
        int count = 20;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        do {
            System.out.println("Dentro do while");
        }while(count < 10);

        for(int i=0; i <10; i++) {
            System.out.println("For" + i);
        }
    }
}
