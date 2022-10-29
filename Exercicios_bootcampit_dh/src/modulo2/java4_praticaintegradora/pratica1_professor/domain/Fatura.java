package modulo2.java4_praticaintegradora.pratica1_professor.domain;

import java.util.List;

public class Fatura {

    private Long codigo;
    private Cliente cliente;
    private List<Item> listaItens;
    private double valorTotal;

    public Fatura(Long codigo, Cliente cliente, List<Item> listaItens) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.listaItens = listaItens;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public double getValorTotal() {
        this.valorTotal = 0;
        for (Item item : listaItens) {
            this.valorTotal+=item.getCustoUnitario()*item.getQuantidade();
        }

        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "codigo=" + codigo +
                ", cliente=" + cliente +
                ", listaItens=" + listaItens +
                ", valorTotal=" + this.getValorTotal() +
                '}';
    }
}
