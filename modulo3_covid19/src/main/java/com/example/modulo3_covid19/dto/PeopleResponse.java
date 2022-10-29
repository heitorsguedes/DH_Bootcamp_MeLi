package com.example.modulo3_covid19.dto;

import com.example.modulo3_covid19.model.Pessoa;

import java.util.List;
import java.util.stream.Collectors;

public class PeopleResponse {

    private String nome;
    private int idade;

    public PeopleResponse(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    private static PeopleResponse convertToPeopleResponse(Pessoa pessoa) {
        return new PeopleResponse(pessoa.getNome(), pessoa.getIdade());
    }

    public static List<PeopleResponse> convertToListPeopleResponse(List<Pessoa> listPeople) {
        return listPeople.stream().map(PeopleResponse::convertToPeopleResponse).collect(Collectors.toList());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
