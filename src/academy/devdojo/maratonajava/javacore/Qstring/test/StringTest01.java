package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Matheus";
        String nome2 = "Matheus";
        nome = nome.concat("Mendes");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Matheus"); //1 variavel de referencia ,2 objeto do tipo string, 3 uma string na pool de string

        System.out.println(nome == nome3);
        System.out.println(nome == nome3.intern());

    }
}
