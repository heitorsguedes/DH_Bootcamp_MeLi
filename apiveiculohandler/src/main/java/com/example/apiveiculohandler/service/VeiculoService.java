package com.example.apiveiculohandler.service;

import com.example.apiveiculohandler.exceptions.NotFoundException;
import com.example.apiveiculohandler.model.Veiculo;
import com.example.apiveiculohandler.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService  implements IVeiculo{

    @Autowired
    VeiculoRepository veiculoRepository;
    @Override
    public Veiculo getVeiculo(String placa) throws NotFoundException {
        Optional<Veiculo> veiculoOptional = veiculoRepository.getVeiculo(placa);
        if(veiculoOptional.isEmpty()){
            throw new NotFoundException("Veiculo nao encontrado");
        }
        return veiculoOptional.get();
    }

    @Override
    public List<Veiculo> getAll() {
        return veiculoRepository.getAll();
    }
}
