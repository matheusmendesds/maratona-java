package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("092020202");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pedro");
        pessoa.setCpf("11291919");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("---------------");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setCpf("9900001");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(18818);

        funcionario.imprime();
    }
}
