package modulo2.java4_praticaintegradora.pratica1_professor.repository;

import modulo2.java4_praticaintegradora.pratica1_professor.domain.Fatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FaturaRepository implements Repository<Fatura> {

    private List<Fatura>listaFaturas = new ArrayList<>();
    @Override
    public void salvar(Fatura objeto) {
        this.listaFaturas.add(objeto);

    }

    @Override
    public void exibirTodosTela() {
        for (Fatura fa : this.listaFaturas) {
            System.out.println(fa.toString());
        }
    }

    @Override
    public Optional<Fatura> buscarById(Long id) {
        for (Fatura fa : this.listaFaturas) {
            if(fa.getCodigo().equals(id)){
                System.out.println("------------Fatura encontrada-----------");
                System.out.println(fa.toString());
                System.out.println("----------------------------------------");
                return Optional.of(fa);
            }
        }
        System.out.println("Fatura não encontrada");
        return Optional.empty();
    }

    @Override
    public void excluirById(Long id) {
        Optional<Fatura>fac = this.buscarById(id);

        if(fac.isEmpty()){
            System.out.println("Fatura nao encontrada");
        }else{
            System.out.println("Fatura excluida");
            listaFaturas.remove(fac.get());
        }
    }

    @Override
    public List<Fatura> buscarTodos() {
        return this.listaFaturas;
    }
}
