package academy.devdojo.maratonajava.projetosTreino.desafioCadastro;

import academy.devdojo.maratonajava.projetosTreino.desafioCadastro.utils.Formulario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static File fileFormulario;

    public static void menu() throws FileNotFoundException {
        System.out.println("menu");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Cadastrar um novo pet\n" + "2-Alterar os dados do pet cadastrado\n" + "3-Deletar um pet cadastrado\n" + "4-Listar todos os pets cadastrados\n" + "5-Listar pets por algum critério (idade, nome, raça)\n" + "6-Sair");
        int i = scanner.nextInt();
        switch (i){
            case 1:
                cadastroPet();
                break;
            case 2:
                System.out.println("Alterar dados");
                break;
            case 3:
                System.out.println("Deletar");
                break;
            case 4:
                System.out.println("Listar todos");
                break;
            case 5:
                System.out.println("listar por criterios");
                break;
            case 6:
                scanner.close();
                break;
            default:
                menu();
        }
    }

    public static void cadastroPet() throws FileNotFoundException {
        Scanner scanner = new Scanner(fileFormulario);
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
            String resp= scanner.next();


        }
    }

    public static void main(String[] args) throws IOException {
        fileFormulario = new File("C:\\Users\\masin\\OneDrive\\Documentos\\ESTUDOS\\java\\maratona-java\\src\\academy\\devdojo\\maratonajava\\projetosTreino\\desafioCadastro\\arquivos\\formulario.txt");
        Formulario formulario = new Formulario(fileFormulario);
        formulario.criarForm();
        menu();


    }

}
