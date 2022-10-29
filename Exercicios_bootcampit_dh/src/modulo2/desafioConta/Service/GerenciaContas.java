package modulo2.desafioConta.Service;

import modulo2.desafioConta.exception.ContaInexistenteException;
import modulo2.desafioConta.exception.InvalidNumberException;
import modulo2.desafioConta.modelo.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GerenciaContas {
    private Map<Integer, Conta> listaContas;
    NumberGenerator geradorNumero;

    public GerenciaContas() {
        this.listaContas = new HashMap<>();
        this.geradorNumero = NumberGenerator.getInstance();
    }
    //Metodos de criacao de contas.

    public void novaContaCorrente(Cliente cliente) {
        int numeroConta = this.geradorNumero.getNext();
        this.listaContas.put(numeroConta, new ContaCorrente(numeroConta, cliente));
    }

    public void novaContaEspecial(Cliente cliente, double limite) {
        int numeroConta = this.geradorNumero.getNext();
        this.listaContas.put(numeroConta, new ContaEspecial(numeroConta, cliente, limite));
    }

    public void novaContaPoupanca(Cliente cliente) {
        int numeroConta = this.geradorNumero.getNext();
        this.listaContas.put(numeroConta, new ContaPoupanca(numeroConta, cliente));
    }

    //Metodos de operacao nao conta

    public void depositar(int numeroConta, double valor) throws ContaInexistenteException, InvalidNumberException {
        Conta conta = this.verificaContaExiste(numeroConta);
        conta.depositar(valor);
    }

    public boolean sacar(int numeroConta, double valor) throws ContaInexistenteException, InvalidNumberException {
        Conta conta = this.verificaContaExiste(numeroConta);
        return conta.sacar(valor);
    }

    public String getDadosConta(int numeroConta) throws ContaInexistenteException {
        Conta conta = this.verificaContaExiste(numeroConta);

        return conta.toString();
    }

    public void transferir(int numeroContaOrigem, int numeroContaDestino, double valor) throws ContaInexistenteException, InvalidNumberException {
        Conta contaOrigem = this.verificaContaExiste(numeroContaOrigem);
        Conta contaDestino = this.verificaContaExiste(numeroContaDestino);

        boolean saqueRealizado = contaOrigem.sacar(valor);

        if (saqueRealizado) {
            contaDestino.depositar(valor);
        }
    }

    public List<String> listarTodasContas() {
        return this.listaContas.values().stream()
                .map(conta -> conta.toString() + " \n")
                .collect(Collectors.toList());
    }

    public List<String> listarContaCorrentePorNumero() {
        return this.listaContas.values().stream()
                .filter(c -> c instanceof ContaCorrente)
                .sorted((c1, c2) -> c1.getNumero() - c2.getNumero())
                .map(c -> c.toString())
                .collect(Collectors.toList());
    }

    public List<String> listarContaCorrentePorSaldo() {
        return this.listaContas.values().stream()
                .sorted(new Comparator<Conta>() {
                    @Override
                    public int compare(Conta o1, Conta o2) {
                        Double saldoConta1 = o1.getSaldo();
                        Double saldoConta2 = o2.getSaldo();
                        return saldoConta2.compareTo(saldoConta1);
                    }
                })
                .map(conta -> conta.toString())
                .collect(Collectors.toList());
    }
//    public List<String>listarContaEspecialSaldoNegativo(){
//
//    }

    //Metodos de verificacao
    public Conta verificaContaExiste(int numeroConta) throws ContaInexistenteException {
        Conta conta = this.listaContas.get(numeroConta);
        if (conta == null) {
            throw new ContaInexistenteException("Conta inexistente.");
        }
        return conta;
    }
}
