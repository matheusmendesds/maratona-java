package academy.devdojo.maratonajava.projetosTreino.desafioCadastro;

import academy.devdojo.maratonajava.projetosTreino.desafioCadastro.utils.Formulario;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File fileFormulario= new File("C:\\Users\\masin\\OneDrive\\Documentos\\ESTUDOS\\java\\maratona-java\\src\\academy\\devdojo\\maratonajava\\projetosTreino\\desafioCadastro\\arquivos\\formulario.txt");
        Formulario formulario = new Formulario(fileFormulario);
        formulario.criarForm();

    }
}
