package exception;

public class InvalidCardNumberException extends BlockCardsException{
    public InvalidCardNumberException(String message) {
        super(message);
    }
}
