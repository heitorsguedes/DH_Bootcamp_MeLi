package modulo2.java4_praticaintegradora.pratica1_professor.repository;

import modulo2.java4_praticaintegradora.pratica1_professor.domain.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemRepository implements Repository<Item>{
    List<Item> listaItens = new ArrayList<>();

    @Override
    public void salvar(Item objeto) {
        this.listaItens.add(objeto);
    }

    @Override
    public void exibirTodosTela() {
        for (Item item : this.listaItens) {
            System.out.println(item.toString());
        }
    }

    @Override
    public Optional<Item> buscarById(Long id) {
        for (Item item : this.listaItens) {
            if(item.getCodigo().equals(id)){
                System.out.println("----------Item encontrado------------");
                System.out.println(item.toString());
                return Optional.of(item);
            }
        }

        System.out.println("Item não encontrado.");
        return Optional.empty();
    }

    @Override
    public void excluirById(Long id) {
        Optional<Item> item = this.buscarById(id);

        if(item.isEmpty()){
            System.out.println("Fatura nao encontrada");
        }else{
            this.listaItens.remove(item.get());
            System.out.println("Fatura excluida");
        }
    }

    @Override
    public List<Item> buscarTodos() {
        return this.listaItens;
    }
}
