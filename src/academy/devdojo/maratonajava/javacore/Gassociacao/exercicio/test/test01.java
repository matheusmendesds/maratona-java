package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Seminario;

public class test01 {
    public static void main(String[] args) {
        Local local = new Local("São Paulo");
        Aluno aluno1 = new Aluno("João",22);
        Professor professor1 = new Professor("Pedro","Matematica");

        Aluno[] alunosSeminario = {aluno1};
        Seminario seminario = new Seminario("Matemática é legal",alunosSeminario,local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor1.setSeminarios(seminariosDisponiveis);

        professor1.imprime();

    }
}
