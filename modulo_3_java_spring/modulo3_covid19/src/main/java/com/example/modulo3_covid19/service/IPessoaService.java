package com.example.modulo3_covid19.service;

import com.example.modulo3_covid19.model.Pessoa;

import java.util.List;


public interface IPessoaService {

    List<Pessoa> getAll();
    List<Pessoa> getPeopleRisk();

}
