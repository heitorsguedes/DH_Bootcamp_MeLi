package modulo2.java3_praticaintegradora.pratica1.exercicio2_impressora.documentos;

public class Livro extends Documento {

    private int numeroPaginas;
    private String autor;
    private String titulo;

    public Livro(int numeroPaginas, String autor, String titulo) {
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.titulo = titulo;
    }


    @Override
    public String toString() {
        return "Livro {" +
                "numeroPaginas=" + numeroPaginas +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                "} ";
    }
}
