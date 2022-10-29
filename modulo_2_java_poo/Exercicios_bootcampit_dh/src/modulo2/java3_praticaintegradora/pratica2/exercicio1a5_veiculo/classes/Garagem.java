package modulo2.java3_praticaintegradora.pratica2.exercicio1a5_veiculo.classes;

import java.util.List;

public class Garagem {
    private int id;
    private List<Veiculo> listaVeiculos;

    public Garagem(int id, List<Veiculo> listaVeiculos) {
        this.id = id;
        this.listaVeiculos = listaVeiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
    public void addVeiculo(Veiculo veiculo){
        this.listaVeiculos.add(veiculo);
    }
}
