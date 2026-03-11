package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Chevrolet";
        carro1.modelo = "Celta";
        carro1.ano = 2015;

        carro2.nome = "Volkswagen";
        carro2.modelo = "Gol";
        carro2.ano = 2016;

        System.out.println("--------------------");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano de fabricação: " + carro1.ano);

        System.out.println("--------------------");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano de fabricação: " + carro2.ano);

    }
}
