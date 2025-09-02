package academy.devdojo.maratonajava.exercicios.a;
import java.util.Scanner;
public class Calculadora {
    Scanner scanner = new Scanner(System.in);
    public void tabuada(int num) {
        int i = 1;
        if (num <= 10) {
            System.out.println("------Tabuada do " + num + "------");
            do {
                int res = i * num;
                System.out.println(i + "x" + num + " = " + res);
                i++;
            } while (i <= 10);
        }
    }

    public void calcularValor(double valor,int formaPgmnt) {
        int parcela ;
        if (formaPgmnt == 1) {
            valor = valor - (valor*0.15);
            System.out.println("Forma de Pagamento: A Vista/PIX , desconto de 15%");
            System.out.println("Valor Final:R$"+ valor );
        } else if (formaPgmnt == 2){
            System.out.println("Credito selecionado , selecione o número de parcelas:");
            parcela = Integer.parseInt(scanner.nextLine());
            if (parcela == 1){
                valor = valor - (valor*0.1);
                System.out.println("Forma de Pagamento: Credito em uma parcela, desconto de 10%");
                System.out.println("Valor Final:R$"+ valor );
            } else if (parcela == 2){
                System.out.println("Forma de Pagamento: Credito em duas parcelas");
                System.out.println("Valor Final:R$"+ valor );
            } else {
                valor = valor + (valor*0.1);
                System.out.println("Forma de Pagamento: Credito em 3 ou mais parcelas, juros de 10%");
                System.out.println("Valor Final:R$"+ valor );
            }
        }
    }

    public void calcularSalario(int aulasDadas , int horaAulas ){
        double descInss = 0.1;
        double salarioBruto = (aulasDadas* horaAulas);
        double salarioLiquido = salarioBruto - (salarioBruto*descInss);
        System.out.println("--------------");
        System.out.println("Valor Hora aulas:R$"+horaAulas);
        System.out.println("Quantidades de Horas leccionadas:R$"+aulasDadas);
        System.out.println("Salario Bruto:R$"+salarioBruto);
        System.out.println("Salario Liquido:R$"+salarioLiquido);
    }

    public void dadosViagem(int distancia, int velocidade){
        int horas;
        int distanciaMetros= distancia*1000;
        int litros = distanciaMetros / 12;
        //distância = tempo x velocidade
        int tempo = distanciaMetros/velocidade;
        System.out.println("Em uma viagem com "+ distancia + "km de distancia");
        System.out.println("Litros utilizados para viagem: "+ litros + "l");
        System.out.println("Tempo da viagem aproximadamente: "+ tempo + " horas");


    }
}
