package academy.devdojo.maratonajava.projetosTreino.desafioCadastro;

import academy.devdojo.maratonajava.projetosTreino.desafioCadastro.exceptions.IdadeException;
import academy.devdojo.maratonajava.projetosTreino.desafioCadastro.exceptions.NameException;
import academy.devdojo.maratonajava.projetosTreino.desafioCadastro.exceptions.PesoException;
import academy.devdojo.maratonajava.projetosTreino.desafioCadastro.utils.Pet;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static File fileFormulario;
    static String padraoSemInformacao = "NÃO INFORMADO";
    //Array de pets 
    static ArrayList<Pet> pets = new ArrayList<>();
    static String nome;


    public static void menu() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Cadastrar um novo pet\n" + "2-Alterar os dados do pet cadastrado\n" + "3-Deletar um pet cadastrado\n" + "4-Listar todos os pets cadastrados\n" + "5-Listar pets por algum critério (idade, nome, raça)\n" + "6-Sair");
        int i = scanner.nextInt();
        switch (i){
            case 1:
                cadastroPet();
                break;
            case 2:
                buscarPet();
                break;
            case 3:
                System.out.println("Alterar dados");
                break;
            case 4:
                System.out.println("Deletar pet");
                break;
            case 5:
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
        int contador = 1;
        String regexNome = "[A-Za-zÀ-ÿ]+(\\s+[A-Za-zÀ-ÿ]+)+$";
        String regexIdade = "^[0-9]{1,2}$";
        String regexRaca = "[A-Za-zÀ-ÿ]+$";
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
            Scanner teclado = new Scanner(System.in);
            String resp = teclado.nextLine();
            switch (contador){
                case 1:
                   if(resp.matches(regexNome)) {
                        pet.setNome(resp);
                        break;
                   }else if(resp.trim().isEmpty()) {
                       resp = padraoSemInformacao;
                       pet.setNome(resp);
                       System.out.println("nome else if:"+resp);
                       break;
                   }else{
                        throw new NameException();
                    }
                case 2:
                    pet.setTipo(resp);
                    break;
                case 3:
                        pet.setSexo(Pet.Sexo.valueOf(resp.toUpperCase()));
                        break;
                case 4:
                    System.out.println("Qual a cidade?");
                    String cidade = teclado.nextLine();
                    System.out.println("Numero da casa:");
                    String numCasa = teclado.nextLine();
                    resp = (resp+","+numCasa+","+cidade);
                    pet.setEndereco(resp);
                    break;
                case 5:
                    int idade = Integer.parseInt(resp);
                    if (resp.matches(regexIdade) && idade < 20) {
                        resp = (resp+" anos");
                        pet.setIdade(resp);
                        break;
                    } else if(resp.isEmpty()) {
                            resp = padraoSemInformacao;
                            pet.setIdade(resp);
                            break;
                    } else {
                        throw new IdadeException();
                    }
                case 6:
                    double peso = Double.parseDouble(resp);
                    if  (peso > 0.5 && peso < 60){
                        resp=(resp+"Kg");
                        pet.setPeso((resp));
                        break;
                    } else if (resp.isEmpty() ) {
                        resp = padraoSemInformacao;
                        pet.setPeso(resp);
                        break;
                    } else {
                        throw new PesoException();
                    }

                case 7:
                    if (resp.isEmpty()){
                        resp = padraoSemInformacao;
                        pet.setRaca(resp);
                        break;
                    } else if (resp.matches(regexRaca)){
                        pet.setRaca(resp);
                        break;
                    } else {
                        System.out.println("Invalido");
                    }

            }
            nome = pet.getNome().toUpperCase().replaceAll("\\s","");
            arquivoPet(contador,resp,nome);
            contador++;
        }
        //precisa adicionar e gravar os pets em um array ainda
        pets.add(pet);
        for (Pet p : pets) {
            System.out.println(p.getNome());
        };
    }

    public static void arquivoPet(int contador,String resp, String pet){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm'-'");
        String horaDia = LocalDateTime.now().format(format);
        File file = new File("C:\\Users\\masin\\OneDrive\\Documentos\\ESTUDOS\\java\\maratona-java\\src\\academy\\devdojo\\maratonajava\\projetosTreino\\desafioCadastro\\pets\\"+ horaDia + pet + ".txt");
        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(contador +" - "+ resp +"\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void buscarPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do pet:");
        String pet = scanner.nextLine();
        System.out.println(pet);
    }
    public static void main(String[] args) throws IOException {
        fileFormulario = new File("C:\\Users\\masin\\OneDrive\\Documentos\\ESTUDOS\\java\\maratona-java\\src\\academy\\devdojo\\maratonajava\\projetosTreino\\desafioCadastro\\arquivos\\formulario.txt");
        menu();
    }

}
