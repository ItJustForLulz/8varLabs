package exceptions;

/**
 * Created by graver_mc on 14.05.2018.
 */
public class NoObjectFoundException extends Exception {
    public NoObjectFoundException() {
    }

    public NoObjectFoundException(String message) {
        super(message);
    }

    public NoObjectFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoObjectFoundException(Throwable cause) {
        super(cause);
    }

    public NoObjectFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
