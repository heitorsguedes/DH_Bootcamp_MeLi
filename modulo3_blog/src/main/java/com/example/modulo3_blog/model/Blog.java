package com.example.modulo3_blog.model;

import java.time.LocalDate;

public class Blog {
    private int id;
    private String titulo;
    private String autor;
    private LocalDate date;

    public Blog(int id, String titulo, String autor, LocalDate date) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
