package modulo2.java4_praticaintegradora.pratica1_professor.repository;

import modulo2.java4_praticaintegradora.pratica1_professor.domain.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteRepository implements Repository<Cliente> {
    private List<Cliente> listaClientes = new ArrayList<>();

    @Override
    public void salvar(Cliente objeto) {
        this.listaClientes.add(objeto);
    }

    @Override
    public void exibirTodosTela() {
        for (Cliente c : this.listaClientes) {
            System.out.println("Id: "+c.getId() + " Nome: " + c.getNome() + " Sobrenome: " + c.getSobrenome());
        }
    }

    @Override
    public Optional<Cliente> buscarById(Long id) {
        for (Cliente cliente : this.listaClientes) {
            if(cliente.getId().equals(id)){

                return Optional.of(cliente);
            }
        }
        return Optional.empty();
    }

    @Override
    public void excluirById(Long id) {
        Optional<Cliente> cliente = this.buscarById(id);
        if(cliente.isEmpty()){
            System.out.println("Cliente não encontrado");
        }else{
            listaClientes.remove(cliente.get());
            System.out.println("Cliente excluido.");
        }
    }

    @Override
    public List<Cliente> buscarTodos() {
        return this.listaClientes;
    }
}
