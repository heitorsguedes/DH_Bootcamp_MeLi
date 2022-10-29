package modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.clientes;

import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes.Transacao;

public abstract class Cliente {
    private String nome;

    public abstract String interagirBanco(Transacao transacao);


    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
