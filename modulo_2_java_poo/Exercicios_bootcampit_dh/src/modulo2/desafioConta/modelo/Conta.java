package modulo2.desafioConta.modelo;

import modulo2.desafioConta.exception.InvalidNumberException;

public abstract class Conta {
    private int numero; // Numero da conta -> Inicializado como 0
    private double saldo; // Saldo da conta -> Inicializado como 0
    private Cliente cliente; //Cliente dono da conta -> Inicializado inicialmente como null (cuidado)

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }
    //Functions

    public void depositar(double valor) throws InvalidNumberException {
        if (valor <= 0) {
            throw new InvalidNumberException("O valor para deposito é inválido.");
        }
        this.saldo += valor;
    }

    public boolean sacar(double valor) throws InvalidNumberException {
        if (valor <= 0) {
            throw new InvalidNumberException("O valor para saque é inválido.");
        }

        this.saldo -= valor;

        return true;
    }
    //toString

    @Override
    public String toString() {
        return "numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente;
    }

    //Getters
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
