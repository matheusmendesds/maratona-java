package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Willian Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Willian Suane");
        sb.append("DevDojo");
        System.out.println(sb);
    }
}
