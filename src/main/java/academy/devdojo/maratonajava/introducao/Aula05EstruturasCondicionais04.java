package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double anualSalario;
        double imposto;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        anualSalario = 70000;
        if(anualSalario <= 34712){
           imposto = primeiraFaixa*anualSalario;

        } else if (anualSalario > 34712 && anualSalario <= 68507){
            imposto = segundaFaixa*anualSalario;
        } else {
            imposto = terceiraFaixa*anualSalario;
        }
        System.out.println("Seu salário anual é "+anualSalario+ "e irá pagar " + imposto + " de imposto");
    }
}
