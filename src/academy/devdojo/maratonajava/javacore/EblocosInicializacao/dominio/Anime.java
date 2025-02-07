package academy.devdojo.maratonajava.javacore.EblocosInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    {
        System.out.println("Dentro do bloco de inicialização");
    }

    public Anime(String nome){
        this.nome = nome;
    }
    public Anime(){
        episodios = new int[100];
        for (int i=0;i < episodios.length; i++){
            episodios[i] = i+1;
        }
        for(int episodio: this.episodios){
            System.out.print(episodio + " ");

        }
    }
}
