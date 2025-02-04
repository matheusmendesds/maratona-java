package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Funcionario;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("Haaland");
        funcionario01.setIdade(25);
        funcionario01.setSalario(new double[]{1209,989,1299});


        funcionario01.dadosFuncionario();
        funcionario01.mediaSalarios();
    }
}
