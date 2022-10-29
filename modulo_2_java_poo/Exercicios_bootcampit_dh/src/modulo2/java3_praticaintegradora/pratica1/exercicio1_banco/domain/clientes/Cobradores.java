package modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.clientes;

import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes.ConsultaSaldo;
import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes.Saque;
import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes.Transacao;

public class Cobradores extends Cliente {

    public Cobradores(String nome) {
        super(nome);
    }

    public Cobradores() {

    }

    @Override
    public String interagirBanco(Transacao transacao) {

        if (transacao instanceof ConsultaSaldo || transacao instanceof Saque) {
            return this.getNome() + " " + transacao.trancacaoOk();
        }

        return transacao.transacaoNaoOk();
    }
}
