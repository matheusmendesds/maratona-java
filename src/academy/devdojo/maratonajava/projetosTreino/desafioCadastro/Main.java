package academy.devdojo.maratonajava.projetosTreino.desafioCadastro;

import academy.devdojo.maratonajava.projetosTreino.desafioCadastro.utils.Pet;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static File fileFormulario;
    static String padraoSemInformacao = "NÃO INFORMADO";

    public static void respostaVazia(String resp){
        resp = padraoSemInformacao;
        System.out.println(resp);
    }

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
        Pet pet = new Pet();
        String nome = "";
        int contador = 1;
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
            Scanner teclado = new Scanner(System.in);
            String resp = teclado.nextLine();
            String regexNome = "^[A-Za-zÀ-ÿ]+(\\s+[A-Za-zÀ-ÿ]+)+$";
            String regexIdade = "^[0-9]{1,2}$";
            switch (contador){
                case 1:
                    if(resp.matches(regexNome)){
                        System.out.println(resp.matches(regexNome));
                        pet.setNome(resp);
                        nome = resp;
                        break;
                    } else if(resp.isEmpty()) {
                        respostaVazia(resp);
                        break;
                    } else{
                    System.out.println("Nome errado");
                    break;
                    }
                case 2:
                    pet.setTipo(resp);
                    break;
                case 3:
                    pet.setSexo(Pet.Sexo.valueOf(resp.toUpperCase()));
                    break;
                case 4:
                    pet.setEndereco(resp);
                    break;
                case 5:
                    if (resp.matches(regexIdade)) {
                        pet.setIdade(Integer.parseInt(resp));
                        break;
                    } else if(resp.isEmpty()) {
                            respostaVazia(resp);
                            break;
                    } else {
                        System.out.println("numero Invalido");
                        break;
                    }
                case 6:
                    if (resp.isEmpty()){
                        respostaVazia(resp);
                    } else {
                        pet.setPeso(Integer.parseInt(resp));
                    }
                    break;
                case 7:
                    if (resp.isEmpty()){
                        respostaVazia(resp);
                    } else {
                        pet.setRaca(resp);
                    }
                    break;
            }

            arquivoPet(contador,resp,nome);
            contador++;
        }
        System.out.println(pet.getNome());
    }

    public static void arquivoPet(int contador,String resp, String pet){
        File file = new File("C:\\Users\\masin\\OneDrive\\Documentos\\ESTUDOS\\java\\maratona-java\\src\\academy\\devdojo\\maratonajava\\projetosTreino\\desafioCadastro\\pets\\"+ pet + ".txt");
        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(contador +"-"+ resp +"\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws IOException {
        fileFormulario = new File("C:\\Users\\masin\\OneDrive\\Documentos\\ESTUDOS\\java\\maratona-java\\src\\academy\\devdojo\\maratonajava\\projetosTreino\\desafioCadastro\\arquivos\\formulario.txt");
        String teste = "";
        respostaVazia(teste);
        menu();


    }

}
