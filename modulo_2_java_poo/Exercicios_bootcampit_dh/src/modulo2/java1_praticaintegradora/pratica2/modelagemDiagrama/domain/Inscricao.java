package modulo2.java1_praticaintegradora.pratica2.modelagemDiagrama.domain;

public class Inscricao{

    Maratonista maratonista;
    String categoria;
    double valorInscricao;

    public Inscricao(Maratonista maratonista, String categoria, double valorInscricao) {
        this.maratonista = maratonista;
        this.categoria = categoria;
        this.valorInscricao = valorInscricao;
    }

    public Maratonista getMaratonista() {
        return maratonista;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValorInscricao() {
        return valorInscricao;
    }

    @Override
    public String toString() {
        return "Inscricao{" +
                "maratonista=" + maratonista +
                ", categoria='" + categoria + '\'' +
                ", valorInscricao=" + valorInscricao +
                '}';
    }

}
