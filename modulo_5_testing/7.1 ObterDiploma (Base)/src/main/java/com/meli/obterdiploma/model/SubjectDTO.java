package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class SubjectDTO {

    @NotBlank(message = "O nome do assunto não pode ficar vazio.")
    @Size(min = 2, max = 30, message = "O comprimento do nome não pode exceder 30 caracteres.")
    @Pattern(regexp = "^[A-Z][^ ]*(.*)", message = "O nome do assunto deve começar com letra maiúscula.")
    String name;
    @NotNull(message = "Nao pode ser vazio")
    @Min(value = 0, message = "Minimo 0")
    @Max(value = 10, message = "Maximo 10")
    Double score;
}
