package zad4.service;

public class EmptyOrderException extends RuntimeException {
    public EmptyOrderException(){super("Empty order");}
}
