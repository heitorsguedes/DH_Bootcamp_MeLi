package modulo2.desafioConta;

import modulo2.desafioConta.Service.GerenciaContas;
import modulo2.desafioConta.Service.NumberGenerator;
import modulo2.desafioConta.exception.InvalidNumberException;
import modulo2.desafioConta.modelo.ContaCorrente;
import modulo2.desafioConta.modelo.Cliente;
import modulo2.desafioConta.modelo.ContaEspecial;
import modulo2.desafioConta.modelo.ContaPoupanca;

// Link exercicio:https://docs.google.com/document/d/e/2PACX-1vTqgZb1Pf7F7h-XtvtRsv-DTXGmKXZXamd6wkSQCLfi2JVt_2fEkiI-NJSXvelVN6BTLXDiNeCM7vJ9/pub
public class Main {
    public static GerenciaContas gerenciaContas = new GerenciaContas();

    public static void main(String[] args) {

        try {
            //Criando clientes
            Cliente cliente1 = new Cliente("Heitor", "12.233.232-00");
            Cliente cliente2 = new Cliente("Ana", "13.233.221-01");
            Cliente cliente3 = new Cliente("Larissa", "15.333.221-21");
            Cliente cliente4 = new Cliente("Larry", "09.323.221-21");
            //Criando contas
            gerenciaContas.novaContaCorrente(cliente1);
            gerenciaContas.novaContaCorrente(cliente2);
            gerenciaContas.novaContaPoupanca(cliente3);
            gerenciaContas.novaContaEspecial(cliente4, 1000);
            //Depositando
            gerenciaContas.depositar(2, 1000);
            gerenciaContas.depositar(1, 200);
            gerenciaContas.depositar(3, 35000);
            gerenciaContas.depositar(4, 20_000);

            //Listando contas

            System.out.println(gerenciaContas.listarTodasContas());

            //Transferindo
            System.out.println("---------------FAZENDO TRANSFERENCIA----------------");
            gerenciaContas.transferir(4,1,2000);
            System.out.println(gerenciaContas.listarTodasContas());

            System.out.println(gerenciaContas.listarContaCorrentePorNumero());
            System.out.println(gerenciaContas.listarContaCorrentePorSaldo());
            //System.out.println(gerenciaContas.getDadosConta(1));
        } catch (Exception e) {
            System.out.println("Erro conta");
        }


    }
}
