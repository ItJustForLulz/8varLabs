package exceptions;

/**
 * Created by graver_mc on 14.05.2018.
 */
public class ArrayLengthException extends Exception {
    public ArrayLengthException() {
    }

    public ArrayLengthException(String message) {
        super(message);
    }

    public ArrayLengthException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayLengthException(Throwable cause) {
        super(cause);
    }

    public ArrayLengthException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getMessage(){
        return "Пустой массив обьектов!";
    }
}
