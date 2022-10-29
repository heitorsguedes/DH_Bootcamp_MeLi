package com.example.modulo3_numerosromanos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("converter")
public class NumeroDecimaisController {
    public int valoresDecimais[] = {1, 5, 10, 50, 100, 500, 1000};
    public String valoresRomanos[] = {"I", "V", "X", "L", "C", "D", "M"};

    @GetMapping("/romanos/{decimal}")
    public String getRomano(@PathVariable int decimal) {
        for (int i = 0; i < this.valoresDecimais.length; i++) {
            if (decimal == this.valoresDecimais[i]) {
                return valoresRomanos[i];
            }
        }
        return "Numero näo encontrado";
    }
}
