package com.example.modulo3_concessionariaveiculos.service;

import com.example.modulo3_concessionariaveiculos.model.Veiculo;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

public interface VeiculoService {

    List<Veiculo> getAll();
    Veiculo getById(int id);
    List<Veiculo> getAllByManufacturingDate(LocalDate minDate, LocalDate maxDate);
    List<Veiculo> getAllByPrice(double min , double max);
    Veiculo save(Veiculo v);
}
