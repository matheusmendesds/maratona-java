package academy.devdojo.maratonajava.projetosTreino.desafioCadastro.exceptions;

public class IdadeException extends RuntimeException {
    public IdadeException() { super("Pet com mais de 20 anos");}
    public IdadeException(String message) {
        super(message);
    }
}
