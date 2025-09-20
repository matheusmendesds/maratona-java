package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo oq não for digitp
        // \s = Espaços em brancp -> \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w= a-ZA-Z, digitos, _
        // \W = Tudo que não for incluso no \w

        String regex = "\\W";
        //String texto = "abaaba";
        String texto2 = "@#hh_j2 12jgb21";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }
    }
}
