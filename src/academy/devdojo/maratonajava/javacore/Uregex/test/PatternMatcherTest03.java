package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo oq não for digitp
        // \s = Espaços em brancp -> \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w= a-ZA-Z, digitos, _
        // \W = Tudo que não for incluso no \w
        // [] -> range
        //String regex = "[abcABC]";
        String regex = "0[xX][0-9a-fA-F]";
        //String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        String texto3 = "cafeBABE";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

        //int numeroHex = 0x0;
        //System.out.println(numeroHex);
    }
}
