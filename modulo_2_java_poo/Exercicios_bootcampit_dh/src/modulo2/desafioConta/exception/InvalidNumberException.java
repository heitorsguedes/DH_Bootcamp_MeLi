package modulo2.desafioConta.exception;

public class InvalidNumberException extends Exception{
    //Sera obrigado a tratar o problema

    //Construtor herdado do pai exception
    public InvalidNumberException(String message) {
        super(message);
    }
}
