package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 20;
        int resultado = n1 + n2;
        double divsao = n1 /(double) n2;
        int vezes = n1 * n2;

        //%
        int resto = 21 % 7;

        // < > >= <= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteQueVinte = 10 != 20;

        // &&(AND) || (OR) !(Not)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMenorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaleiMaiorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        System.out.println("isDentroDaleiMaiorQueTrinta " + isDentroDaleiMaiorQueTrinta);

        double valorTotalContaCorrente = 500;
        double valorTotalContaPoupanca = 10000;
        float valorPlay = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlay || valorTotalContaPoupanca > valorPlay;
        System.out.println("isPlaystationCincoCompravel" + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus /= 2;
        bonus *= 2;
        bonus %= 2;
        System.out.println(bonus);
        //
        int contador = 0;
        contador +=1;
        contador++;
        System.out.println(contador);

    }

}
