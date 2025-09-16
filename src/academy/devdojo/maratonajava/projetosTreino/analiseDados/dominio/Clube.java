package academy.devdojo.maratonajava.projetosTreino.analiseDados.dominio;

public class Clube {
    public String nome;
    public int anoFund;

    public Clube(String nome, int anoFund) {
        this.nome = nome;
        this.anoFund = anoFund;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFund() {
        return anoFund;
    }

    public void setAnoFund(int anoFund) {
        this.anoFund = anoFund;
    }
}
