package com.example.storage_exercicio02.service.i;

import com.example.storage_exercicio02.model.Tutorial;

import java.util.List;
import java.util.Optional;

public interface ITutorial {
    Tutorial insert(Tutorial tutorial);

    List<Tutorial> getAll();

    Optional<Tutorial> getById(Long id);

    Tutorial update(Tutorial tutorial);

    void deleteAll();

    /**
     * Deleta Tutorial por ID
     *
     * @param id
     * @return void
     */
    void deleteById(Long id);

    List<Tutorial> getPublished();

    List<Tutorial> getByTitle(String title);
}
