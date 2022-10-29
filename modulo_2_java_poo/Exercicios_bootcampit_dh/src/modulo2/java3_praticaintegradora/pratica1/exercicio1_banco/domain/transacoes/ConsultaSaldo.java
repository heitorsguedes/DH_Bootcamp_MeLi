package modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes;

public class ConsultaSaldo implements Transacao{
    @Override
    public String trancacaoOk() {
        return "Consultando saldo.";
    }

    @Override
    public String transacaoNaoOk() {
        return "Consulta sem sucesso.";
    }
}
