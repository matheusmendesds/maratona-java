package academy.devdojo.maratonajava.projetosTreino.cadastro.test;

import academy.devdojo.maratonajava.projetosTreino.cadastro.dominio.Veiculo;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Veiculo veiculo01 = new Veiculo("Carro","Onix","Chevrolet",2020);
        Veiculo veiculo02 = new Veiculo("Moto","Titan","Honda",2014);
        veiculo01.imprime();
        veiculo01.addCarro();
        veiculo02.imprime();
        veiculo02.addCarro();
    }
}
