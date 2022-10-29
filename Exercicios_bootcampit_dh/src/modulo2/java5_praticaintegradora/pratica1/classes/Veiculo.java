package modulo2.java5_praticaintegradora.pratica1.classes;

import java.util.Objects;

public abstract class Veiculo {
    private double velocidade;
    private double aceleracao;
    private int anguloGiro;
    private String placa;
    private double peso;
    private int rodas;


    public Veiculo(double velocidade, double aceleracao, int anguloGiro, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloGiro = anguloGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public Veiculo(){

    };
    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public int getAnguloGiro() {
        return anguloGiro;
    }

    public void setAnguloGiro(int anguloGiro) {
        this.anguloGiro = anguloGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloGiro=" + anguloGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Double.compare(veiculo.velocidade, velocidade) == 0 && Double.compare(veiculo.aceleracao, aceleracao) == 0 && anguloGiro == veiculo.anguloGiro && Double.compare(veiculo.peso, peso) == 0 && rodas == veiculo.rodas && placa.equals(veiculo.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidade, aceleracao, anguloGiro, placa, peso, rodas);
    }


}
