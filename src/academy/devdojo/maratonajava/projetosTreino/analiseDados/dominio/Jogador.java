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

    public Jogador(String nome, int idade, int desarmes, int gols, int jogos, int assistencias, int passes) {
        this.nome = nome;
        this.idade = idade;
        this.desarmes = desarmes;
        this.gols = gols;
        this.jogos = jogos;
        this.assistencias = assistencias;
        this.passes = passes;
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
       int desarmes = this.desarmes;
       int jogos = this.jogos;
       int assistencias = this.assistencias;
       int passes = this.passes;
       int gols = this.gols;
       System.out.println("------Estatisticas por jogo------");
       System.out.println("Nome:" + this.nome);
       System.out.println("Jogos:" + jogos);
       double golsPorJogo = (double) gols / jogos;
       golsPorJogo = Math.round(golsPorJogo * 100.0) / 100.0;

       double passesPorJogo = (double) gols / jogos;
        passesPorJogo = Math.round(passesPorJogo * 100.0) / 100.0;

        double assistsPorJogo = (double) assistencias/jogos;
        assistsPorJogo = Math.round(assistsPorJogo * 100.0) / 100.0;


       //System.out.println("Gols por Jogos: " + String.format("%.2f", (double) gols / jogos));
    //       System.out.println("Assistencias por Jogos: " + String.format("%.2f", (double) assistencias/jogos));
//       System.out.println("Passes por Jogos: " + String.format("%.2f", (double) passes / jogos));
//       System.out.println("Desarmes por Jogos: " + String.format("%.2f", (double) desarmes / jogos));

    }
    public void analiseJogador(){
        //Melhorar esse metodo aqui para ficar com mais dados
        calcularStats();
        System.out.println("---------------------");
        System.out.println("Comentarios adicionais:");
        if (gols > jogos) {
            System.out.println("O jogador tem mais gols do que jogos");
        } else {
            System.out.println("sem comentarios adicionais");
        }

        if (gols > jogos && assistencias > jogos) {
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
