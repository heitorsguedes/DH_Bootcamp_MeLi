package com.example.modulo3_covid19.model;

public class Sintoma {
    private int codigo;
    private String nome;
    private int nivelGravidade;

    public Sintoma(int codigo, String nome, int nivelGravidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.nivelGravidade = nivelGravidade;
    }

    public Sintoma() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelGravidade() {
        return nivelGravidade;
    }

    public void setNivelGravidade(int nivelGravidade) {
        this.nivelGravidade = nivelGravidade;
    }
}