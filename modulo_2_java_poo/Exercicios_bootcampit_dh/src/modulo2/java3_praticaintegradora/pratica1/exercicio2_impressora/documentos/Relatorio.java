package modulo2.java3_praticaintegradora.pratica1.exercicio2_impressora.documentos;

public class Relatorio extends Documento {
    private String texto;
    private int numeroPaginas;
    private String autor;

    public Relatorio(String texto, int numeroPaginas, String autor) {
        this.texto = texto;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Relatorio {" +
                "texto='" + texto + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", autor='" + autor + '\'' +
                "} ";
    }
}
