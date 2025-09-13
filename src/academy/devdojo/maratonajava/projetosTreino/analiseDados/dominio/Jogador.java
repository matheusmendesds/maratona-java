package academy.devdojo.maratonajava.projetosTreino.analiseDados.dominio;

import javax.sound.midi.Soundbank;

public class Jogador {
    public String nome;
    public int idade;
    public int desarmes;
    public int gols;
    public int jogos;
    public int assistencias;
    public int passes;

    private double golsPorJogo;
    private double passesPorJogo;
    private double assistsPorJogo;
    private double desarmePorJogo;

    public Jogador(String nome, int idade, int desarmes, int gols, int jogos, int assistencias, int passes) {
        this.nome = nome;
        this.idade = idade;
        this.desarmes = desarmes;
        this.gols = gols;
        this.jogos = jogos;
        this.assistencias = assistencias;
        this.passes = passes;
    }

    public void varData() {
        golsPorJogo = Math.round(((double) gols / jogos) * 100.0) / 100.0;
        passesPorJogo = Math.round(((double) passes / jogos) * 100.0) / 100.0;
        assistsPorJogo = Math.round(((double) assistencias / jogos) * 100.0) / 100.0;
        desarmePorJogo = Math.round(((double) desarmes/jogos) * 100.0)/100.0;
    }

    public void imprime(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
        System.out.println("Jogos:" + this.jogos);
        System.out.println("Gols:" + this.gols);
        System.out.println("Assistencias:" + this.assistencias);
        System.out.println("Desarmes:" + this.desarmes);
        System.out.println("Passes:" + this.passes);
    }

    public void calcularStats(){
        varData();
        System.out.println("------Estatisticas por jogo------");
        System.out.println("Nome:" + this.nome);
        System.out.println("Jogos:" + jogos);
        System.out.println("Gols por Jogo:" + golsPorJogo);
        System.out.println("Passes por Jogo:" + passesPorJogo);
        System.out.println("Assitências por Jogo:" + assistsPorJogo);
        System.out.println("Desarmes por Jogo:" + desarmePorJogo);

    }
    public void analiseJogador(){
        //Melhorar esse metodo aqui para ficar com mais dados
        calcularStats();
        System.out.println("---------------------");
        System.out.println("Comentarios adicionais:");
        varData();
        if (golsPorJogo > 0.7) {
            System.out.println("O jogador tem mais gols do que jogos");
        } else {
            System.out.println("sem comentarios adicionais");
        }

        if (golsPorJogo >= 1  && assistsPorJogo >= 0.5) {
            System.out.println("Jogador adicionado a lista de prioridade.");

        }
        System.out.println("----------------------------------");

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDesarmes() {
        return desarmes;
    }

    public void setDesarmes(int desarmes) {
        this.desarmes = desarmes;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getJogos() {
        return jogos;
    }

    public void setJogos(int jogos) {
        this.jogos = jogos;
    }

    public int getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(int assistencias) {
        this.assistencias = assistencias;
    }

    public int getPasses() {
        return passes;
    }

    public void setPasses(int passes) {
        this.passes = passes;
    }
}
