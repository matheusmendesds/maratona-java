package academy.devdojo.maratonajava.exercicios;


import academy.devdojo.maratonajava.exercicios.a.Calculadora;
import academy.devdojo.maratonajava.exercicios.a.Produto;

import java.util.Scanner;

public class exercicio12 {
//12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
//pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
//1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto -
//2- À Vista no cartão de crédito, recebe 10% de desconto -
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();

    System.out.println("Insira o valor do Produto");
    int preco = Integer.parseInt(scanner.nextLine());
    System.out.println("Forma de pagamento:");
    System.out.println("1-A vista/Pix 2-Credito");
    int formaPagamento = Integer.parseInt(scanner.nextLine());

    calculadora.calcularValor(preco,formaPagamento);

}
}
