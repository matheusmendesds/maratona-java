package academy.devdojo.maratonajava.exercicios.calculadora;

public class Calculadora {
    public void calcularMedia(double[] notas){
        double soma = 0;
        for (double num : notas) {
            soma += num;

        }
        double media = soma/3;
        System.out.println("A media de notas é: " + media);
    }

    public void calcularAprovacao(double[] notas){
        double soma = 0;
        for (double num : notas) {
            soma += num;

        }
        double media = soma/4;
        if (media >= 7.0){
            System.out.println("A média do aluno foi: " + media + " resultado:Aprovado");
        } else {
            System.out.println("A média do aluno foi: " + media + " resultado:Reprovado");
        }

    }
    public void tela(double valor){
        System.out.println("-------------------");
        System.out.println("Forma de pagamento:A vista(Dinheiro/Pix ou Cartão)");
        System.out.println("Valor Total: "+ valor);
        System.out.println("-------------------");
    }
    public void valorFinal(int formPag, int parcelas, double valorProduto){
        if(formPag == 2 && parcelas < 2){
            double desconto = 10.0/100 * valorProduto;
            double valor = valorProduto - desconto;
            tela(valor);
            System.out.println("Total do desconto: " + desconto);
        } else if (formPag == 1 && parcelas <2) {
            double desconto = 15.0/100 * valorProduto;
            double valor = valorProduto - desconto;
            tela(valor);
            System.out.println("Total do desconto: " + desconto);
        } else if (formPag == 2 && parcelas == 2) {
            double valor = valorProduto;
            tela(valor);
            System.out.println("Total do desconto:Sem desconto " );
        } else if (formPag == 2 && parcelas >2){
            double juros = 10.0/100 * valorProduto;
            double valor = valorProduto + juros;
            tela(valor);
            System.out.println("Total do juros: " + juros);
        } else {
            System.out.println("Forma de pagamento invalida, tente novamente!");
        }
    }
}
