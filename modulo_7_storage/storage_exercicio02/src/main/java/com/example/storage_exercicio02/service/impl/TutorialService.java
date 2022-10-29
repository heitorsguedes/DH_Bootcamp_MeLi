package com.example.storage_exercicio02.service.impl;

import com.example.storage_exercicio02.exception.InvalidParamException;
import com.example.storage_exercicio02.model.ENUM.Status;
import com.example.storage_exercicio02.model.Tutorial;
import com.example.storage_exercicio02.repository.TutorialRepo;
import com.example.storage_exercicio02.service.i.ITutorial;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor //Faz a injecao de dependencia via CONSTRUCTOR
public class TutorialService implements ITutorial {

    private final TutorialRepo tutorialRepo;

    @Override
    public Tutorial insert(Tutorial tutorial) {
        if (tutorial == null) {
            throw new InvalidParamException("O tutorial não pode ser nulo");
        }

        if (tutorial.getId() != null) {
            throw new InvalidParamException("O tutorial não pode ter ID");
        }
        tutorial.setStatus(Status.DRAFT);
        return tutorialRepo.save(tutorial);
    }

    @Override
    public List<Tutorial> getAll() {
        return null;
    }

    @Override
    public Optional<Tutorial> getById(Long id) {
        return tutorialRepo.findById(id);
    }

    @Override
    public Tutorial update(Tutorial tutorial) {
        if (tutorial == null) {
            throw new InvalidParamException("O tutorial nao pode ser null");
        }
        if (tutorial.getId() == null) {
            throw new InvalidParamException("O tutorial deve ter ID");
        }

        return tutorialRepo.save(tutorial);
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Tutorial> getPublished() {

        return tutorialRepo.findByStatus(Status.PUBLISHED);
    }

    @Override
    public List<Tutorial> getByTitle(String title) {
        return tutorialRepo.findByTitleContaining(title);
    }
}
