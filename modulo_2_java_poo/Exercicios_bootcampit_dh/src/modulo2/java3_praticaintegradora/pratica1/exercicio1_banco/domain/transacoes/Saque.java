package modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes;

public class Saque implements Transacao{
    @Override
    public String trancacaoOk() {
        return "Saque realizado com sucesso!!";
    }

    @Override
    public String transacaoNaoOk() {
        return "Saquee nao realizado!!";
    }
}
