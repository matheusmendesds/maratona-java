package academy.devdojo.maratonajava.projetosTreino.listas.services;

import academy.devdojo.maratonajava.projetosTreino.listas.dominio.Time;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//Criar lista txt com nomes dos times pra salvar e dps passar para os jogadores
//Criar pasta de cada time com os jogadores criados la dentro
public class CriarTime {
     public void creatingTeam() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Nome do Time:");
         String nome = scanner.nextLine();
         System.out.println("País do Time");
         String pais = scanner.nextLine();
         Time novoTime = new Time(nome,pais);
         System.out.println(novoTime);
         saveTeam(nome,pais);
     }

     public void saveTeam(String nome ,String pais) {
         File file = new File("C:\\Users\\masin\\OneDrive\\Documentos\\ESTUDOS\\java\\maratona-java\\src\\academy\\devdojo\\maratonajava\\projetosTreino\\listas\\data\\times\\"+nome+".txt");
         try(FileWriter fw = new FileWriter(file,true);
             BufferedWriter bw = new BufferedWriter(fw)) {
             bw.write("Nome:" + nome +"\n");
             bw.write("País:"+ pais);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }
}
