package com.example.storage_exercicio02.exception;

public class InvalidParamException extends RuntimeException {
    public InvalidParamException(String message){
        super(message);
    }
}
