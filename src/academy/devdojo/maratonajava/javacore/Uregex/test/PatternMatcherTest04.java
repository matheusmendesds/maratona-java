package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo oq não for digitp
        // \s = Espaços em brancp -> \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w= a-ZA-Z, digitos, _
        // \W = Tudo que não for incluso no \w
        // [] -> range
        //? -> Zero ou uma ocorrencia
        //* -> Zero ou mais ocorrencias
        //+ -> uma ou mais ocorrencias
        //{n,m} de n até m
        // ()
        // | -> ou
        //| -> o (v|c) o  ovo ou oco
        // $ -> fim da linha

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

    }
}
