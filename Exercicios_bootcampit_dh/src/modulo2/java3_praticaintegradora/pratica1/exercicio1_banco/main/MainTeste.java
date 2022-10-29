package modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.main;

import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.clientes.Basico;
import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.clientes.Cobradores;
import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.clientes.Executivos;
import modulo2.java3_praticaintegradora.pratica1.exercicio1_banco.domain.transacoes.*;

public class MainTeste {

    public static void main(String[] args) {

        Deposito d = new Deposito();
        Saque q = new Saque();
        ConsultaSaldo cs = new ConsultaSaldo();
        PagamentoServico ps = new PagamentoServico();
        Transferencia t = new Transferencia();

        System.out.println("EXECUTIVOS");
        System.out.println();

        Executivos ex1 = new Executivos("Larissa");
        System.out.println(ex1.interagirBanco(d));
        System.out.println(ex1.interagirBanco(q));
        System.out.println(ex1.interagirBanco(cs));
        System.out.println(ex1.interagirBanco(ps));
        System.out.println(ex1.interagirBanco(t));
        System.out.println();
        System.out.println("COBRADORES");
        System.out.println();

        Cobradores c1 = new Cobradores("Fernando");
        System.out.println(c1.interagirBanco(d));
        System.out.println(c1.interagirBanco(q));
        System.out.println(c1.interagirBanco(cs));
        System.out.println(c1.interagirBanco(ps));
        System.out.println(c1.interagirBanco(t));

        System.out.println();
        System.out.println("BASICO");
        System.out.println();

        Basico b1 = new Basico("Miau");
        System.out.println(b1.interagirBanco(q));
        System.out.println(b1.interagirBanco(cs));
        System.out.println(b1.interagirBanco(ps));
        System.out.println(b1.interagirBanco(t));


    }
}
