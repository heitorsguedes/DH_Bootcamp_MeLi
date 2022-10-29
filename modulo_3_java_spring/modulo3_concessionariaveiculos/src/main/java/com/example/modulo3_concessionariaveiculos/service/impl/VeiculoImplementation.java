package com.example.modulo3_concessionariaveiculos.service.impl;

import com.example.modulo3_concessionariaveiculos.model.Veiculo;
import com.example.modulo3_concessionariaveiculos.service.VeiculoService;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VeiculoImplementation implements VeiculoService {
    private static final List<Veiculo> veiculoList = new ArrayList<>(List.of(new Veiculo(1, "Chevrolet", "Corsa", LocalDate.of(2016, 12, 13), 20_000, 2, 8_000, "BR", 2), new Veiculo(2, "Ford", "K", LocalDate.of(2011, 10, 4), 10_000, 4, 12_000, "BR", 1), new Veiculo(3, "XL", "Renault", LocalDate.of(2014, 3, 19), 15_000, 4, 13_000, "BR", 1), new Veiculo(4, "Ford", "K2", LocalDate.of(2017, 2, 28), 3_000, 4, 15_000, "BR", 1)));

    @Override
    public List<Veiculo> getAll() {
        return veiculoList;
    }

    @Override
    public Veiculo getById(int id) {

        return veiculoList.stream().filter(v -> (v.getId() == id)).findFirst().get();
    }

    @Override
    public List<Veiculo> getAllByManufacturingDate(LocalDate minDate, LocalDate maxDate) {
        return veiculoList.stream()
                .filter(v -> v.getManufacturingDate().compareTo(minDate) > 0 && v.getManufacturingDate().compareTo(maxDate) < 0)
                .collect(Collectors.toList());

    }

    @Override
    public List<Veiculo> getAllByPrice(double min, double max) {
        return veiculoList.stream().filter(v -> v.getPrice() >= min && v.getPrice() <= max).collect(Collectors.toList());

    }

    @Override
    public Veiculo save(Veiculo v) {
        v.setId(veiculoList.get(veiculoList.size()-1).getId()+1);
        v.setListServices(v.getListServices());
        veiculoList.add(v);
        return v;
    }
}
