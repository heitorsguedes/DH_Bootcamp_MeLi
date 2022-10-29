package modulo2.java2_praticaintegradora.pratica2.pratica2_produtos;

public class Venda {
    private Produto produto;
    private int quantidadeVendida;
    private double valorTotalVenda;

    public Venda(Produto produto, int quantidadeVendida) {
        this.produto = produto;
        this.quantidadeVendida = quantidadeVendida;
        this.valorTotalVenda = produto.calcular(quantidadeVendida);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "produto=" + produto +
                ", quantidadeVendida=" + quantidadeVendida +
                ", valorTotalVenda=" + valorTotalVenda +
                '}';
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }
}
