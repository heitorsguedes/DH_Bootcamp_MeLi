package com.example.storage_exercicio01.controller;

import com.example.storage_exercicio01.model.Joia;
import com.example.storage_exercicio01.service.JoiaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/joia")
public class JoiaController {
    @Autowired
    JoiaService joiaService;

    @GetMapping
    public ResponseEntity<List<Joia>> findAll() {
        return new ResponseEntity<>(joiaService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{cod}")
    public ResponseEntity<Joia>findJoiaById(@PathVariable long cod){
        Optional<Joia> optionalJoia = joiaService.findById(cod);

        if(optionalJoia.isPresent()){
            return new ResponseEntity<>(optionalJoia.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<String> novaJoia(@RequestBody Joia joia){
        joiaService.create(joia);
        return new ResponseEntity<>("Numero ID:"+joia.getId(),HttpStatus.CREATED);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Joia> updateJoia(@RequestBody Joia joia){

        return new ResponseEntity<>(joiaService.update(joia),HttpStatus.OK);
    }

    @DeleteMapping("/excluir/{cod}")
    public ResponseEntity<Void>deleteJoia(@PathVariable long cod){
        joiaService.deleteById(cod);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}