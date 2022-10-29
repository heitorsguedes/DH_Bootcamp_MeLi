package com.example.modulo3_covid19.controller;

import com.example.modulo3_covid19.dto.PeopleResponse;
import com.example.modulo3_covid19.model.Pessoa;
import com.example.modulo3_covid19.service.IPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    IPessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<Pessoa>>getAll(){
        return new ResponseEntity<>(pessoaService.getAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/riskperson")
    public ResponseEntity<List<PeopleResponse>>getPeopleRisk(){

        return new ResponseEntity<>(PeopleResponse.convertToListPeopleResponse(pessoaService.getPeopleRisk()),HttpStatus.OK);
    }

}