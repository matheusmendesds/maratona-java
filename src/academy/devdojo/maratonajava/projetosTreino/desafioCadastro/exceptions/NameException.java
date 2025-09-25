package academy.devdojo.maratonajava.projetosTreino.desafioCadastro.exceptions;

public class NameException extends RuntimeException {
    public NameException () { super("Nome invalido");}
    public NameException(String message) {
        super(message);
    }
}
