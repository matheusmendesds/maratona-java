package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }


}
