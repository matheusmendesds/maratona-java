package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser Pago: " + imposto);
        if(produto instanceof Tomate){

            //Tomate tomate = (Tomate) produto;
            //System.out.println(tomate.getDataValidade());
            //Forma simplificada de fazer o codigo acima
            System.out.println(((Tomate) produto).getDataValidade());
        }
    }
}
