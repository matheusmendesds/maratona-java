package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    //0- Bloco de inicializacao estatico da super classe é executado quando o JVM carregar classe pai
    //1- Bloco de inicializacao estatico da sub classe é executado quando a JVM carreagar classe filha
    //2- Alocado espaco em memoria pro objeto da superclasse
    //3- Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado
    //4- Bloco de inicializacao da superclasse é executado na ordem em que aparece
    //5- Construtor é executdo da superclasse
    //6- Alocado espaco em memoraia pro objeto da subclasse
    //7- Cada atributo de subclasse é criado e inicializado com valores defalt ou o que for passado
    //8- Bloco de inicializacao da subclasse é executado na ordem em que aparece
    //9- Construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Pedro");

    }
}
