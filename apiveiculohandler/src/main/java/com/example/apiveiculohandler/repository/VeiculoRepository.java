package com.example.apiveiculohandler.repository;

import com.example.apiveiculohandler.model.Veiculo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class VeiculoRepository {
    private final String linkFile = "src/main/resources/dbveiculos.json";
    /*

        Nao faremos injecao de dependencia do ObjectMapper pois é algo interno de um metodo, normalmente usamos
        autowired para injetar quando for algo base do framework(service,repository etc...)
     */
    ObjectMapper mapper = new ObjectMapper(); // Mapeamento do arquivo que iremos ler.

    public Optional<Veiculo> getVeiculo(String placa) {
        List<Veiculo> listaVeiculos = buscarLista();
        //Regra de negocio sendo aplicada.
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                return Optional.of(veiculo);
            }
        }
        return Optional.empty();
    }

    public List<Veiculo>getAll(){
        List<Veiculo> listaVeiculos = this.buscarLista();
        return listaVeiculos;
    }

    public List<Veiculo>buscarLista (){
        List<Veiculo> listaVeiculos = null;
        try {
            //Buscando lista veiculos no "banco de dados" em resources -> .json
            listaVeiculos = Arrays.asList(mapper.readValue(new File(linkFile), Veiculo[].class));
        } catch (Exception e) {
            System.out.println("Problemas de leitura.");

        }
        return listaVeiculos;
    }
}
