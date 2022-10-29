package modulo2.java5_praticaintegradora.pratica1.classes;

public class Moto extends Veiculo{

    public Moto(){
        this.setPeso(300);
        this.setRodas(2);
    }

    public Moto(double velocidade, double aceleracao, int anguloGiro, String placa) {
        this();
        this.setVelocidade(velocidade);
        this.setAceleracao(aceleracao);
        this.setAnguloGiro(anguloGiro);
        this.setPlaca(placa);
    }


}
