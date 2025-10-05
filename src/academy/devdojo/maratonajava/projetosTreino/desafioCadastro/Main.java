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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static File fileFormulario;
    static String padraoSemInformacao = "NÃO INFORMADO";
    static ArrayList<Pet> pets = new ArrayList<>();
    static String nome;


    public static void menu() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Cadastrar um novo pet\n" + "2-Buscar dados do pet cadastrado\n" + "3-Alterar um pet cadastrado\n" + "4-Deletar um pet cadastrado\n" + "5-Sair");
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
            System.out.println(p);
        }

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

    public static void carregarPets() {
        File pasta = new File("C:\\Users\\masin\\OneDrive\\Documentos\\ESTUDOS\\java\\maratona-java\\src\\academy\\devdojo\\maratonajava\\projetosTreino\\desafioCadastro\\pets");
        if (!pasta.exists() || !pasta.isDirectory()) {
            System.out.println("Nenhum pet encontrado ainda.");
            return;
        }

        File[] arquivos = pasta.listFiles((dir, name) -> name.endsWith(".txt"));
        if (arquivos == null) return;

        for (File arquivo : arquivos) {
            try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
                Pet pet = new Pet();
                String linha;
                while ((linha = br.readLine()) != null) {
                    String[] partes = linha.split(" - ");
                    if (partes.length < 2) continue;
                    int campo = Integer.parseInt(partes[0].trim());
                    String valor = partes[1].trim();

                    switch (campo) {
                        case 1: pet.setNome(valor); break;
                        case 2: pet.setTipo(valor); break;
                        case 3: pet.setSexo(Pet.Sexo.valueOf(valor.toUpperCase())); break;
                        case 4: pet.setEndereco(valor); break;
                        case 5: pet.setIdade(valor); break;
                        case 6: pet.setPeso(valor); break;
                        case 7: pet.setRaca(valor); break;
                    }
                }
                pets.add(pet);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void buscarPet() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do pet:");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;
        for (Pet p : pets) {
            if (p.getNome() == null) continue;
            Pattern pattern = Pattern.compile(nomeBusca , Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(p.getNome());

            if(matcher.find()){
                System.out.println("Pet encontrado:");
                System.out.println(p);
                encontrado = true;
            }

        }

        if (!encontrado) {
            System.out.println("Nenhum pet encontrado com o nome: " + nomeBusca);
        }

    }
    public static void main(String[] args) throws IOException {
        fileFormulario = new File("C:\\Users\\masin\\OneDrive\\Documentos\\ESTUDOS\\java\\maratona-java\\src\\academy\\devdojo\\maratonajava\\projetosTreino\\desafioCadastro\\arquivos\\formulario.txt");
        carregarPets();
//        for (Pet p : pets) {
//            System.out.println(p);
//        }
        menu();
    }

}
