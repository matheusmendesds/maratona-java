package academy.devdojo.maratonajava.projetosTreino.desafioCadastro.exceptions;

public class SexoException extends RuntimeException {
    public SexoException(){super("Sexo invalido, utilize 'macho' ou 'femea'");}
    public SexoException(String message) {
        super(message);
    }
}
