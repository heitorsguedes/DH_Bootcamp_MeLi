package com.example.apiveiculohandler.service;

import com.example.apiveiculohandler.exceptions.NotFoundException;
import com.example.apiveiculohandler.model.Veiculo;

import java.util.List;

public interface IVeiculo {

    Veiculo getVeiculo(String placa) throws NotFoundException;
    List<Veiculo> getAll();
}
