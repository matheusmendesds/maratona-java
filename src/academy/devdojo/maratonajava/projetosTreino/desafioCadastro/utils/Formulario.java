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
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void addLinha(String linha , File file) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(linha);
        bw.newLine();
        bw.flush();
    }
}
