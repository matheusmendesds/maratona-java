package academy.devdojo.maratonajava.projetosTreino.deposito.produtos;

public class Eletronico extends Produto {
    private final String tipo = "eletronico";

    public Eletronico(String nome, double preco, int estoque) {
        super(nome, preco, estoque);
    }

}
