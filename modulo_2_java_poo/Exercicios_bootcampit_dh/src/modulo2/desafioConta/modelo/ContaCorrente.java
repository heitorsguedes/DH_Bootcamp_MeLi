package modulo2.desafioConta.modelo;

import modulo2.desafioConta.exception.InvalidNumberException;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public boolean sacar(double valor) throws InvalidNumberException {
        if(this.saldoInsuficiente(valor)){
            return false;
        }
        return super.sacar(valor);
    }

    public boolean saldoInsuficiente(double valor){
        return this.getSaldo() < valor;
        //Se o valor for maior que o saldo return TRUE
        // Example: Saldo 1000 , Saque 1200 -> TRUE -> Saldo Insuficiente
    }

    //toString

    @Override
    public String toString() {
        return "ContaCorrente: " + super.toString();
    }
}
