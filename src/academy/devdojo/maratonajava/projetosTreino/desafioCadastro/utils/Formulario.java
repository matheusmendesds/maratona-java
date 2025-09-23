package academy.devdojo.maratonajava.projetosTreino.desafioCadastro.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Formulario {
    private File file;

    public Formulario(File file) {
        this.file = file;
    }

    public static void criarForm() {
        try {
            File fileFormulario= new File("C:\\Users\\masin\\OneDrive\\Documentos\\ESTUDOS\\java\\maratona-java\\src\\academy\\devdojo\\maratonajava\\projetosTreino\\desafioCadastro\\arquivos\\formulario.txt");
            boolean isFileCreated = fileFormulario.createNewFile();
            System.out.println(isFileCreated);
            if (isFileCreated) {
                addLinha(fileFormulario);
            }
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
    private static void addLinha(File file) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("1 - Qual o nome e sobrenome do pet?");
        bw.newLine();
        bw.write("2 - Qual o tipo do pet (Cachorro/Gato)?");
        bw.newLine();
        bw.write("3 - Qual o sexo do animal?");
        bw.newLine();
        bw.write("4 - Qual endereço e bairro que ele foi encontrado?");
        bw.newLine();
        bw.write("5 - Qual a idade aproximada do pet?");
        bw.newLine();
        bw.write("5 - Qual a idade aproximada do pet?");
        bw.newLine();
        bw.write("7 - Qual a raça do pet?");
        bw.newLine();
        bw.flush();
    }
}
