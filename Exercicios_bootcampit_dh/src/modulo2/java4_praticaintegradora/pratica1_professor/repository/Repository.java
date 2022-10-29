package modulo2.java4_praticaintegradora.pratica1_professor.repository;

import java.util.List;
import java.util.Optional;

public interface Repository <T>{

    void salvar(T objeto);
    void exibirTodosTela();
    Optional<T> buscarById(Long id);
    void excluirById(Long id);
    List<T> buscarTodos();
}
