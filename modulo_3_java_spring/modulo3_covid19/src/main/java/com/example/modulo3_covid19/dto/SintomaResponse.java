package com.example.modulo3_covid19.dto;

import com.example.modulo3_covid19.model.Sintoma;

import java.util.List;
import java.util.stream.Collectors;

public class SintomaResponse {
    private String nome;
    private int gravidade;

    private SintomaResponse(String nome, int gravidade) {
        this.nome = nome;
        this.gravidade = gravidade;
    }

    public static SintomaResponse convertToSintomaResponse(Sintoma sintoma) {
        return new SintomaResponse(sintoma.getNome(), sintoma.getNivelGravidade());
    }

    public static List<SintomaResponse> convertListToSintoma(List<Sintoma> listSintomas) {

        return listSintomas.stream()
                .map(SintomaResponse::convertToSintomaResponse)
                .collect(Collectors.toList());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGravidade() {
        return gravidade;
    }

    public void setGravidade(int gravidade) {
        this.gravidade = gravidade;
    }

}
