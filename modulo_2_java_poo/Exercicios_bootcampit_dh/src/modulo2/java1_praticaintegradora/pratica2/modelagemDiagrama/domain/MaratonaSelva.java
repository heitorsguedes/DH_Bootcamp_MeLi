package modulo2.java1_praticaintegradora.pratica2.modelagemDiagrama.domain;

import java.util.List;

public class MaratonaSelva {

    private List<Circuito> listaCircuitos;
    private int totalInscritos;
    private double valorTotalArrecadado;
    public MaratonaSelva(List<Circuito> listaCircuitos, int totalInscritos, double valorTotalArrecadado) {
        this.listaCircuitos = listaCircuitos;
        this.totalInscritos = totalInscritos;
        this.valorTotalArrecadado = valorTotalArrecadado;
    }

    public List<Circuito> getListaCircuitos() {
        return listaCircuitos;
    }

    public int getTotalInscritos() {
        return totalInscritos;
    }

    public double getValorTotalArrecadado() {
        return valorTotalArrecadado;
    }

    @Override
    public String toString() {
        return "MaratonaSelva{" +
                "listaCircuitos=" + listaCircuitos +
                ", totalInscritos=" + totalInscritos +
                ", valorTotalArrecadado=" + valorTotalArrecadado +
                '}';
    }
}