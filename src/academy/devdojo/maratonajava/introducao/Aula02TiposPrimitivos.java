package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte,short, long, boolean
        int idade = 19;
        long numeroGrande = (long) 100000.0;
        double salarioDouble = 2000;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Qualquer coisa";
        System.out.println("A idade é "+ idade);
        System.out.println(idadeByte);
        System.out.println(nome);
    }

}
