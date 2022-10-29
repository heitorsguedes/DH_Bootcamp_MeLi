package com.example.modulo5_sample_junit.calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    public void setup() {
        this.calculadora = new Calculadora();
        System.out.println("Antes de cada teste eu instanciei a calculadora.");
    }

    @Test
    @DisplayName("Validar soma")
    public void soma_returnInt_whenValidInput() {
        //setup
        int v1 = 15;
        int v2 = 20;
        int expected = 35;

        //run
        int resp = calculadora.somar(v1, v2);

        //validate
        assertEquals(expected, resp);

    }

    @Test
    @DisplayName("Validar divisao")
    public void dividir_returnZero_whenDivisorEqualsZero() {
        //setup
        double v1 = 4;
        double v2 = 0;
        double expected = 0;
        //run
        double resp = calculadora.dividir(v1, v2);
        //validate
        assertEquals(expected, resp);
    }
}
