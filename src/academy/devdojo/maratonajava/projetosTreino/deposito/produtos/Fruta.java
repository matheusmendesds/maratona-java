package academy.devdojo.maratonajava.projetosTreino.deposito.produtos;

public class Fruta extends Produto {
    private final String tipo = "Fruta";

    public Fruta(String nome, double preco, int estoque) {
        super(nome, preco, estoque);
    }


    @Override
    public String toString() {
        return "Produto{" +
                "tipo='" + tipo + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }

    public String getTipo() {
        return tipo;
    }
}
