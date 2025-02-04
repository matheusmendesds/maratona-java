package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Jiraya";
        //pessoa.idade = 70;
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        //pessoa.imprime();
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
    }
}
