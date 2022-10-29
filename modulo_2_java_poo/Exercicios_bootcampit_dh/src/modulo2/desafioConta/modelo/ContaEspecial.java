package modulo2.desafioConta.modelo;

import modulo2.desafioConta.exception.InvalidNumberException;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, Cliente cliente, double limite) {
        super(numero, cliente);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) throws InvalidNumberException {
        if(this.saldoInsuficiente(valor)){
            return false;
        }
        return super.sacar(valor);
    }

    public boolean saldoInsuficiente(double valor){
        return (this.getSaldo() + this.limite) < valor;
        //Se o valor for maior que o saldo + limite return TRUE
        // Example: Saldo 1000 + limite 1000 = 2000 , Saque 2200 -> TRUE -> Saldo Insuficiente
    }

    @Override
    public String toString() {
        return "ContaEspecial: "+super.toString();
    }
}
