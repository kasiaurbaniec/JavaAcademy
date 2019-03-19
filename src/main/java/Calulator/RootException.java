package Calulator;

public class RootException extends RuntimeException {
    public RootException() {
        super("Can't root a negative number");
    }

}
