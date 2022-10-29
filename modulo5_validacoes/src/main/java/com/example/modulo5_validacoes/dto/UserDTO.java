package com.example.modulo5_validacoes.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class UserDTO {

    @NotBlank(message = "O nome é obrigatorio")
    private String nome;

    @NotBlank(message = "O email é obrigatorio")
    @Email(message = "O email deve ser válido")
    private String email;

    @Min(value = 18, message = "A idade minima é 18 anos")
    private int idade;

}