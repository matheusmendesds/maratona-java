package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Neymar", "Gabigol", "Rollheiser", "Brazão");
        List<Integer> numeros = List.of(10,9,32,77);
        forEach(strings, s -> System.out.println(s));
        forEach(numeros,i -> System.out.println(i));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
