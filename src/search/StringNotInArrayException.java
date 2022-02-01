package search;

public class StringNotInArrayException extends RuntimeException {
    public StringNotInArrayException(String message) {
        super(message);
    }

    public StringNotInArrayException() {
        super();
    }
}
