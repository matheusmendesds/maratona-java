package academy.devdojo.maratonajava.projetosTreino.analiseDados.dominio;

import java.util.ArrayList;
import java.util.List;

public class Clube {
    public String nome;
    public int anoFund;
    public List<Jogador> jogadores;

    public Clube(String nome, int anoFund) {
        this.nome = nome;
        this.anoFund = anoFund;
        this.jogadores = new ArrayList<>();
    }

    // método para adicionar jogador ao clube
    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    // método para listar jogadores
    public void listarJogadores() {
        System.out.println("Jogadores do " + nome + ":");
        for (Jogador j : jogadores) {
            System.out.println("- " + j.nome);
        }
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
