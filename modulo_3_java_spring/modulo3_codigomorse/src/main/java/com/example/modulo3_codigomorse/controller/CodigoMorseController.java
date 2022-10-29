package com.example.modulo3_codigomorse.controller;

import com.example.modulo3_codigomorse.service.CodigoMorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/morse")
public class CodigoMorseController {

    @Autowired
    CodigoMorseService codigoMorseService;
    @PostMapping
    public String test(@RequestBody String morse){

        return codigoMorseService.transformarMorseEmAz(morse);
    }

}
