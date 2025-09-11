package academy.devdojo.maratonajava.projetosTreino.cadastro.dominio;

public class Veiculo {
    public String tipo;
    public String modelo;
    public String marca;
    public int ano;
    public int km;

    public Veiculo(String tipo, String modelo, String marca, int ano,int km) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.km = km;
    }
    public void addCarro(){
        System.out.println("Veiculo:"+modelo + " adicionado ao banco de Dados");
    }
    public void removerCarro() {
        System.out.println("Veiculo:"+modelo + " removido do banco de Dados");
    }
    public void imprime(){
        System.out.println("Tipo:" + tipo);
        System.out.println("Modelo:" + modelo);
        System.out.println("Marca:" + marca);
        System.out.println("Ano:" + ano);
        System.out.println("Kilometragem:" + km + "km");
        System.out.println("------------");

    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
