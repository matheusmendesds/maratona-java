package academy.devdojo.maratonajava.projetosTreino.desafioCadastro;

import academy.devdojo.maratonajava.projetosTreino.desafioCadastro.utils.Formulario;
import academy.devdojo.maratonajava.projetosTreino.desafioCadastro.utils.Pet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static File fileFormulario;

    public static void menu() throws FileNotFoundException {
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
                System.out.println("Opção Invalida, escolha uma opção de 1 a 6:");
                menu();
        }
    }

    public static void cadastroPet() throws FileNotFoundException {
        Scanner scanner = new Scanner(fileFormulario);
        //List<String> dados = new ArrayList<>();
        Pet dados = new Pet();
        dados.setIdade(12);
        dados.setNome("Teste");
        dados.setEndereco("Teste");
        dados.setPeso(3);
        dados.setRaca("Teste");
        dados.setTipo("Teste");
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
            Scanner teclado = new Scanner(System.in);
            String resp= teclado.next();



            System.out.println(dados);
        }
    }

    public static void main(String[] args) throws IOException {
        fileFormulario = new File("C:\\Users\\masin\\OneDrive\\Documentos\\ESTUDOS\\java\\maratona-java\\src\\academy\\devdojo\\maratonajava\\projetosTreino\\desafioCadastro\\arquivos\\formulario.txt");
        Formulario formulario = new Formulario(fileFormulario);
        formulario.criarForm();
        menu();


    }

}
