package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Neymar Jr");
        lista.add("Neymar Jr");

        for (String s : lista) {
            System.out.println(s);
        }

        add(lista,new Consumidor("Santos"));

        for (Object o : lista) {
            System.out.println(o);
        }
    }
    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);

    }



}


