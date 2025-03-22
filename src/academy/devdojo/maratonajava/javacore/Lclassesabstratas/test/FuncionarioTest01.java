package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente Gerente = new Gerente("Paulo",1000);
        Desenvolvedor dev = new Desenvolvedor("Leo", 1200);
        System.out.println(Gerente);
        System.out.println(dev);
        Gerente.imprime();
        dev.imprime();

    }
}
