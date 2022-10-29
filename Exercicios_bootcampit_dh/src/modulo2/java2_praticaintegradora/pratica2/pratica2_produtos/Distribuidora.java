package modulo2.java2_praticaintegradora.pratica2.pratica2_produtos;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

    public static void main(String[] args) {
        Pereciveis p1 = new Pereciveis("Banana", 0.5, 4);
        Pereciveis p2 = new Pereciveis("Uva", 0.7, 1);
        Pereciveis p3 = new Pereciveis("Bolo", 5, 2);
        Pereciveis p4 = new Pereciveis("Bolo2", 4, 5);
        Pereciveis p5 = new Pereciveis("Bolo3", 7, 1);
        NaoPereciveis np1 = new NaoPereciveis("Oleo de Soja", 2, "Oleos");
        NaoPereciveis np2 = new NaoPereciveis("Sabao é IP", 1, "Sabonetes");
        NaoPereciveis np3 = new NaoPereciveis("Sabao em Po", 2, "Sabonetes");
        NaoPereciveis np4 = new NaoPereciveis("Sabao em Po2", 2.5, "Sabonetes");
        NaoPereciveis np5 = new NaoPereciveis("Sabao em Po3", 4, "Sabonetes");


        List<Venda> listaVendidos = new ArrayList<>();

        listaVendidos.add(new Venda(p1, 5));
        listaVendidos.add(new Venda(p2, 5));
        listaVendidos.add(new Venda(p3, 5));
        listaVendidos.add(new Venda(p4, 5));
        listaVendidos.add(new Venda(np4, 5));
        listaVendidos.add(new Venda(np5, 5));


        for (Venda listaVendido : listaVendidos) {
            System.out.printf("Valor total venda: %.2f --Item vendido: %s\n",listaVendido.getValorTotalVenda(),listaVendido.getProduto().getNome());
        }

    }
}
