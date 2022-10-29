package modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes;

public class Transferencia implements Transacao{
    @Override
    public String trancacaoOk() {
        return "Transferencia realizada com sucesso!!";
    }

    @Override
    public String transacaoNaoOk() {
        return "Transferencia nao realizada!!";
    }
}
