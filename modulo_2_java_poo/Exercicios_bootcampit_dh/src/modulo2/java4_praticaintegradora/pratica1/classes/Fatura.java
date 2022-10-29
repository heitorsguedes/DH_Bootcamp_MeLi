package modulo2.java4_praticaintegradora.pratica1.classes;

import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class Fatura {
    private Cliente cliente;
    private List<Item> listItens;
    private Double totalCompra;


    public Fatura(Cliente cliente, List<Item> listItens) {
        this.cliente = cliente;
        this.listItens = listItens;
        this.totalCompra = listItens.stream().mapToDouble(item -> item.getPreco()).reduce(0, new DoubleBinaryOperator() {
            @Override
            public double applyAsDouble(double left, double right) {
                return left + right;
            }
        });
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getListItens() {
        return listItens;
    }

    public void setListItens(List<Item> listItens) {
        this.listItens = listItens;
    }

    public void addItem(Item item) {
        this.listItens.add(item);
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "cliente=" + cliente +
                ", listItens=" + listItens +
                ", totalCompra=" + totalCompra +
                '}';
    }
}
