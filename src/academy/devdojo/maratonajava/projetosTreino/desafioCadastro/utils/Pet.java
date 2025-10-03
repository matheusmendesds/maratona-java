package academy.devdojo.maratonajava.projetosTreino.desafioCadastro.utils;

import academy.devdojo.maratonajava.projetosTreino.desafioCadastro.exceptions.NameException;

public class Pet {
    private String nome;
    private String tipo;
    private Sexo sexo;
    public enum Sexo{
        MACHO,FEMEA;
    };
    private String[] endere = new String[3];
    private String endereco;
    private String idade;
    private String peso;
    private String raca;

    public String[] getEndere() {
        return endere;
    }

    public void setEndere(String numCasa, String cidade, String complemento) {
        endere[0] = numCasa;
        endere[1] = cidade;
        endere[2] = complemento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", sexo=" + sexo +
                ", endereco='" + endereco + '\'' +
                ", idade='" + idade + '\'' +
                ", peso='" + peso + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
