package modulo2.java1_praticaintegradora.pratica2.modelagemDiagrama.domain;

import java.util.List;

public class Circuito {

    private String categoria;
    private int distancia;
    private List<Inscricao> listaInscritos;

    public Circuito(String categoria, int distancia, List<Inscricao> listaInscritos) {
        this.categoria = categoria;
        this.distancia = distancia;
        this.listaInscritos = listaInscritos;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getDistancia() {
        return distancia;
    }

    public List<Inscricao> getListaInscritos() {
        return listaInscritos;
    }

    @Override
    public String toString() {
        return "Circuito{" +
                "categoria='" + categoria + '\'' +
                ", distancia=" + distancia +
                ", listaInscritos=" + listaInscritos +
                '}';
    }
}
