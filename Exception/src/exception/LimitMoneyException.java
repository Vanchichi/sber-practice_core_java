package exception;

public class LimitMoneyException extends BankOnlineException{
    public LimitMoneyException(String message){
        super(message);
    }
}
