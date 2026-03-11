package academy.devdojo.maratonajava.exercicios;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class exercicio15 {
    public static void main(String[] args) {
        //exercicio 15
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir a data (formato: yyyy-MM-dd)
        System.out.println("Digite a data (yyyy-MM-dd):");
        String nascData = scanner.nextLine();

        LocalDate dataInserida = LocalDate.parse(nascData);
        LocalDate dataHoje = LocalDate.now();

        Period calcularData = Period.between(dataInserida,dataHoje);

        System.out.println("Calculando dias desde o nascimento...");
        System.out.println("Anos: "+ calcularData.getYears());
        System.out.println("Mesês: "+ calcularData.getMonths());
        System.out.println("Dias: "+ calcularData.getDays());

        scanner.close();

    }
}
