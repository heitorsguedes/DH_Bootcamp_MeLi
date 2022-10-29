package com.example.modulo5_validacoes.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class ExceptionsDetails {
    private String title;
    private String message;
    private String fields;
    private String fieldMessages;
    private LocalDateTime timestamp;
}
