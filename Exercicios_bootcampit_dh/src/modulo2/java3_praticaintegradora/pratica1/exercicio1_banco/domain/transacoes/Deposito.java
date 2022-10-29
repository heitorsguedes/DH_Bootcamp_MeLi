package modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes;

public class Deposito implements Transacao {
    @Override
    public String trancacaoOk() {
        return "Deposito realizado com sucesso!!";
    }

    @Override
    public String transacaoNaoOk() {
        return "Deposito não realizado com sucesso!!";
    }
}
