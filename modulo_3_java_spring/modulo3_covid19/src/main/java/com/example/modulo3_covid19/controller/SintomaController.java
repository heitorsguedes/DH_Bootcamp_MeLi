package com.example.modulo3_covid19.controller;

import com.example.modulo3_covid19.dto.SintomaResponse;
import com.example.modulo3_covid19.model.Sintoma;
import com.example.modulo3_covid19.service.ISymptomService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sintomas")
public class SintomaController {

    @Autowired
    ISymptomService sintomaService;

    @GetMapping
    public ResponseEntity<List<Sintoma>> getAll() {
        return new ResponseEntity<>(sintomaService.getAllSymption(), HttpStatus.OK);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<SintomaResponse> getByName(@PathVariable String nome) {
        return new ResponseEntity<>(SintomaResponse.convertToSintomaResponse(sintomaService.getSintomaByName(nome)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<SintomaResponse>postSintoma(@RequestBody Sintoma sintoma){
        return new ResponseEntity<>(SintomaResponse.convertToSintomaResponse(sintomaService.saveSintoma(sintoma)),HttpStatus.CREATED);
    }

}
