package com.example.modulo3_concessionariaveiculos.controller;

import com.example.modulo3_concessionariaveiculos.model.Veiculo;
import com.example.modulo3_concessionariaveiculos.service.VeiculoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/v1/api/veiculos")
public class VeiculoController {

    @Autowired
    VeiculoService veiculoService;

    @PostMapping
    public ResponseEntity<Veiculo>save(@RequestBody Veiculo v){
        return new ResponseEntity<>(veiculoService.save(v),HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Veiculo>> getAll() {

        return ResponseEntity.ok(veiculoService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Veiculo> getById(@PathVariable int id) {
        return ResponseEntity.ok(veiculoService.getById(id));
    }

    @GetMapping(path = "/prices")
    public ResponseEntity<List<Veiculo>> getByPrice(@RequestParam double since, @RequestParam double to) {
        return ResponseEntity.ok(veiculoService.getAllByPrice(since, to));
    }

    @GetMapping(path = "dates")
    public ResponseEntity<List<Veiculo>> getByManufacturingDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate since, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {
        return ResponseEntity.ok(veiculoService.getAllByManufacturingDate(since, to));
    }

}
