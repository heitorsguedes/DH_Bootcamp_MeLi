package com.example.storage_exercicio02.service.impl;

import com.example.storage_exercicio02.model.ENUM.Status;
import com.example.storage_exercicio02.model.Tutorial;
import com.example.storage_exercicio02.repository.TutorialRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class TutorialServiceTest {

    @InjectMocks
    private TutorialService tutorialService;

    @Mock
    private TutorialRepo tutorialRepo;

    @Test
    void insert() {
        BDDMockito.when(tutorialRepo.save(ArgumentMatchers.any(Tutorial.class)))
                .thenReturn(new Tutorial(1L, "Snoop", "Descricao", Status.DRAFT));

        Tutorial newTutorial = tutorialService.insert(new Tutorial(null, "Snoop", "Descricao", null));

        assertThat(newTutorial).isNotNull();
        assertThat(newTutorial.getId()).isPositive();
        assertThat(newTutorial.getStatus()).isEqualTo(Status.DRAFT);
    }

    @Test
    void getAll() {
    }

    @Test
    void getById() {
    }

    @Test
    void update() {
    }

    @Test
    void deleteAll() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void getPublished() {
    }

    @Test
    void getByTitle() {
    }
}