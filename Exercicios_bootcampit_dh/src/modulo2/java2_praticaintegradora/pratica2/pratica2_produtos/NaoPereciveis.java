package modulo2.java2_praticaintegradora.pratica2.pratica2_produtos;

public class NaoPereciveis extends Produto {
    private String tipo;

    public NaoPereciveis(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NaoPereciveis{" +
                "tipo='" + tipo + '\'' +
                "} " + super.toString();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
