package academy.devdojo.maratonajava.projetosTreino.desafioCadastro.utils;

import java.io.File;
import java.io.IOException;

public class Formulario {
    public static void criarForm() {
        try {
            File fileFormulario= new File("C:\\Users\\masin\\OneDrive\\Documentos\\ESTUDOS\\java\\maratona-java\\src\\academy\\devdojo\\maratonajava\\projetosTreino\\desafioCadastro\\arquivos\\formulario.txt");
            boolean isFileCreated = fileFormulario.createNewFile();
            System.out.println(isFileCreated);
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }

}
