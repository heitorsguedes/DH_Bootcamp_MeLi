package com.example.modulo3_covid19.service;

import com.example.modulo3_covid19.model.Sintoma;

import java.util.List;

public interface ISymptomService {

    Sintoma getSintomaByName(String name);

    List<Sintoma> getAllSymption();

    Sintoma saveSintoma(Sintoma sintoma);
}
