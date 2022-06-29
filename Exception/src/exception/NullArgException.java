package exception;

public class NullArgException extends BankOnlineException{
    private String message;
    public NullArgException(String message) {
        super(message);
    }
}
