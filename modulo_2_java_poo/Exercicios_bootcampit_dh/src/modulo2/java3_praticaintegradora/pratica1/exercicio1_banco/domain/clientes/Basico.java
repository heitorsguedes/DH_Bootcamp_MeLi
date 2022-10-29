package modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.clientes;

import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes.ConsultaSaldo;
import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes.PagamentoServico;
import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes.Saque;
import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes.Transacao;

public class Basico extends Cliente {

    public Basico() {

    }

    public Basico(String nome) {
        super(nome);
    }

    @Override
    public String interagirBanco(Transacao transacao) {
        if (transacao instanceof Saque || transacao instanceof ConsultaSaldo || transacao instanceof PagamentoServico) {
            return this.getNome() + " " + transacao.trancacaoOk();
        }
        return transacao.transacaoNaoOk();
    }
}