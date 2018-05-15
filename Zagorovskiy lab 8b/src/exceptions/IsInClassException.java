package exceptions;

/**
 * Created by graver_mc on 14.05.2018.
 */
public class IsInClassException extends Exception{
    public IsInClassException() {
    }

    public IsInClassException(String message) {
        super(message);
    }

    public IsInClassException(String message, Throwable cause) {
        super(message, cause);
    }

    public IsInClassException(Throwable cause) {
        super(cause);
    }

    public IsInClassException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
