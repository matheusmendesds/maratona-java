package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        //Add itens array
        nomes.add("Gabigol");
        nomes.add("SantosFC");
        //Removendo itens
        nomes.remove(1);

        //add outro array
        nomes2.add("Messi");
        nomes2.add("Kaká");

        //trasnformando dois arrays em um só
        nomes.addAll(nomes2);
        //lendo os itens do array
        for(String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("---------");

        for(int i = 0 ; i < nomes.size(); i++){
            System.out.println(nomes.get(i));

        }
        //n pode criar List<int> , se for usar colecoes de numeros tem q ser Integer
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);


    }
}
