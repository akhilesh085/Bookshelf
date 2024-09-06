public class InvalidOptionException extends Exception {
    public InvalidOptionException(String message) {
        super(message);
    }

    public String wrongOptionMessage() {
        return "The option you have selected is invalid";
    }
}

