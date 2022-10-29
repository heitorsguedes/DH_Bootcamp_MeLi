package modulo2.java5_praticaintegradora.pratica1;

import modulo2.java5_praticaintegradora.pratica1.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Veiculo v1 = new Carro(100, 15, 23, "65BV");
        Veiculo v2 = new Carro(120, 7, 20, "43");
        Veiculo v3 = new Carro(150, 10, 11, "6BV");
        Veiculo v4 = new Moto(200, 17, 14, "BV");
        Veiculo v5 = new Moto(130, 12, 15, "11BV");
        Veiculo v6 = new Moto(140, 9, 16, "BVLLK");
        SalvaVidasAuto v7 = new SalvaVidasAuto();
        SalvaVidasMoto v8 = new SalvaVidasMoto();
        List<Veiculo> veiculosCorrida = new ArrayList<>(List.of(v1, v2, v3, v4, v5, v6));
        Corrida corrida = new Corrida(120.0, 100_000.0, "Corrida Maluco", 7, veiculosCorrida, v7, v8);

        corrida.socorrerMoto("43");
        corrida.socorrerAuto("4x3");
        System.out.println(corrida);
    }
}
