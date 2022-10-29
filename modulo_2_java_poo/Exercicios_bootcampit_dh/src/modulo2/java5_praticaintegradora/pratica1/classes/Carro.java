package modulo2.java5_praticaintegradora.pratica1.classes;

public class Carro extends Veiculo{
    private final String teste = "Teste";
    public Carro(){
        this.setRodas(4);
        this.setPeso(1000);
    }

    public Carro(double velocidade, double aceleracao, int anguloGiro, String placa) {
        this();
        this.setVelocidade(velocidade);
        this.setAceleracao(aceleracao);
        this.setAceleracao(anguloGiro);
        this.setPlaca(placa);

    }
}
