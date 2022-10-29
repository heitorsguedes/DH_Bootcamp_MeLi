package modulo2.java2_praticaintegradora.pratica2.pratica2_produtos;

public class Pereciveis extends Produto{
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeProdutos) {
        double valorFinal = super.calcular(quantidadeProdutos);

        if (this.diasParaVencer == 1) {
            return valorFinal / 4;
        } else if (this.diasParaVencer == 2) {
            return valorFinal / 3;
        } else if (this.diasParaVencer == 3) {
            return valorFinal / 2;
        }

        return valorFinal;
    }


    @Override
    public String toString() {
        return "NaoPereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                "} " + super.toString();
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }
}
