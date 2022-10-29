package com.example.modulo3_blog.exceptions;

public class AlreadyExistedException extends RuntimeException {

    public AlreadyExistedException(String message) {
        super(message);
    }
}
