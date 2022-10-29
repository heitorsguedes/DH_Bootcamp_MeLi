package com.example.modulo5_sample_junit.calculadora;

public class Calculadora {

    public int somar(int n1, int n2) {
        return n1 + n2;
    }

    public double dividir(double n1, double n2) {
        if (n2 == 0) return 0;

        return n1 / n2;
    }
}
