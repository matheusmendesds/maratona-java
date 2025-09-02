package academy.devdojo.maratonajava.projetosTreino.calculadora.servicos;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Calculadora {
    public void operacao(int n1 , int n2){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1-Soma 2-Subtração 3-Multiplicação 4-Divisão");
        int operacao = Integer.parseInt(scanner.nextLine());
        int res;
        switch (operacao){
            case 1:
                System.out.println("Soma");
                System.out.println(n1 +" + "+ n2);
                res = n1+n2;
                System.out.println("Resultado:"+res);
                break;
            case 2:
                System.out.println("Subtração");
                System.out.println(n1 +" - "+ n2);
                res = n1-n2;
                System.out.println("Resultado:"+ res);
                break;
            case 3:
                System.out.println("Multiplicação");
                System.out.println(n1 +" x "+ n2);
                res = n1*n2;
                System.out.println("Resultado:"+ res);
                break;
            case 4:
                System.out.println("Divisão");
                System.out.println(n1 +" / "+ n2);
                res = n1/n2;
                System.out.println("Resultado:"+ res);
                break;
            default:
                System.out.println("Operação invalida");
        }

    }
}
