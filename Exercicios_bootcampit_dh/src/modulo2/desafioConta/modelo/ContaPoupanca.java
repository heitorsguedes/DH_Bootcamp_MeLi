package modulo2.desafioConta.modelo;

import modulo2.desafioConta.exception.InvalidNumberException;

public class ContaPoupanca extends Conta {
    public static double taxa = 1;     //Essa taxa pode ser alterada -> Aqui está em 1 real

    public ContaPoupanca(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public boolean sacar(double valor) throws InvalidNumberException {
        if (this.saldoInsuficiente(valor)) {
            return false;
        }
        return super.sacar(valor + ContaPoupanca.taxa);
    }

    public boolean saldoInsuficiente(double valor) {
        return this.getSaldo()  < (valor+ ContaPoupanca.taxa);
        //Se o valor+taxa for maior que o saldo return TRUE
        // Example: Saldo 1000 = 1000 , Saque 1000 + taxa 10 = 1010 -> TRUE -> Saldo Insuficiente
    }

    //toString
    @Override
    public String toString() {
        return "ContaPoupanca: " + super.toString();
    }

    //Getters & Setters
    public static void setTaxa(double taxa) {
        ContaPoupanca.taxa = taxa;
    }

    public static double getTaxa() {
        return taxa;
    }
}
