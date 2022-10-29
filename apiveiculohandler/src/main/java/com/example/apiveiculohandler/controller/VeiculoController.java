package com.example.apiveiculohandler.controller;


import com.example.apiveiculohandler.exceptions.NotFoundException;
import com.example.apiveiculohandler.model.Veiculo;
import com.example.apiveiculohandler.service.IVeiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    //@Autowired
    //private VeiculoService veiculoService; //Injecao de dependencia
    //private VeiculoService veiculoService = new VeiculoService(); //Sem injecao

    /*
        Essa abordagem usando interface autowired em vez da classe que implementa a interface
        funciona melhor pois caso eu queira trocar a classe eu nao preciso mexer nessa implementacao
        que automaticamente o Spring buscara quem implementa IVeiculo a interface.

     */
    @Autowired
    private IVeiculo veiculoService;//Usando quem implementa a interface, essa abordagem funciona melhor que a de cima

    @GetMapping("/{placa}")
    public ResponseEntity<Veiculo> getVeiculo(@PathVariable String placa) {
        //Veiculo veiculo = null;
        Veiculo veiculo = veiculoService.getVeiculo(placa);
        return new ResponseEntity<>(veiculo, HttpStatus.OK);

    }
    @GetMapping
    public ResponseEntity<List<Veiculo>>getAllVeiculos(){
        return new ResponseEntity<>(this.veiculoService.getAll(),HttpStatus.OK);
    }
}
