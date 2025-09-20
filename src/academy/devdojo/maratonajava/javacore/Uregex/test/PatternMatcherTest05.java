package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        //. 1.3 = 123 , 133 , 1@3 , 1A3

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "joao@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.com.br , teste@gmail.com.br, sakura@nmail";
        System.out.println("#@!zoro@mail.com.br".matches(regex));

        System.out.println(texto.split(",")[1].trim());

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
