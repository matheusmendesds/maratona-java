package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media ;
//    public int salario1;
//    public int salario2;
//    public int salario3;

    public void dadosFuncionario() {
        System.out.println("--------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (double salario: salario){
            System.out.println(salario + " ");
        }
    }

    public void mediaSalarios() {

        for (double salario : salario) {
            media += salario;
        }
            media/= salario.length;
            System.out.println("A media de salario é: " + media);


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

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

}
