package academy.devdojo.maratonajava.projetosTreino.desafioCadastro.exceptions;

public class PesoException extends RuntimeException {
  public PesoException(){super("Pet com mais de 60kg ou menos de 0.5kg");}
    public PesoException(String message) {
        super(message);
    }
}
