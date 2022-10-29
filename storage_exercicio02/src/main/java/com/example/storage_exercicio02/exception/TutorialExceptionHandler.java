package com.example.storage_exercicio02.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class TutorialExceptionHandler {

    @ExceptionHandler(InvalidParamException.class)
    public ResponseEntity<ExceptionDetais> handlerInvalidParamException(InvalidParamException ex) {
        return new ResponseEntity<>(
                ExceptionDetais
                        .builder()
                        .title("Parâmetro Invalido")
                        .message(ex.getMessage())
                        .timestamp(LocalDateTime.now())
                        .build(), HttpStatus.BAD_REQUEST
        );
    }
}
