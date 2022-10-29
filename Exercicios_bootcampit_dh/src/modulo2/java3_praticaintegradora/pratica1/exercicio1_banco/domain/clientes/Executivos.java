package modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.clientes;

import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes.Deposito;
import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes.Transacao;
import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes.Transferencia;

public class Executivos extends Cliente {
    public Executivos(String nome) {
        super(nome);
    }

    public Executivos() {

    }

    @Override
    public String interagirBanco(Transacao transacao) {
        if (transacao instanceof Deposito || transacao instanceof Transferencia) {
            return this.getNome() + " " + transacao.trancacaoOk();
        }
        return transacao.transacaoNaoOk();
    }
}
