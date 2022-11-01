package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Getter
@Setter
public class StudentDTO {
    @NotBlank
    @Size(min = 2, max = 50, message = "Minimo de duas letras e maximo de 50")
    @Pattern(regexp = "^[A-Z][^ ]*(.*)", message = "A primeira letra deve ser maiuscula")
    String studentName;
    String message;
    Double averageScore;
    @NotEmpty(message = "A lista nao pode estar vazia")
    @Valid
    List<SubjectDTO> subjects;
}