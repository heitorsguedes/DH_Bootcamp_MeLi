package com.example.storage_exercicio02.repository;

import com.example.storage_exercicio02.model.ENUM.Status;
import com.example.storage_exercicio02.model.Tutorial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

//testando se o repo funciona bem, se grava, se le etc... nao testa regra de negocio
@ActiveProfiles("test")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TutorialRepoTest {
    @Autowired
    private TutorialRepo tutorialRepo;
    @BeforeEach
    public void setup(){
        tutorialRepo.deleteAll();;

    }

    @Test
    public void save_returnTutorial_whenTutorialIsValid(){

        Tutorial tutorialSetado = new Tutorial(null,"Titulo Test","Descricao Test",Status.DRAFT);
        Tutorial testTutorialSaved = tutorialRepo.save(tutorialSetado);

        assertThat(testTutorialSaved).isNotNull();
        assertThat(testTutorialSaved.getId()).isPositive();
        assertThat(testTutorialSaved.getStatus()).isEqualTo(Status.DRAFT);
        assertThat(testTutorialSaved.getTitle()).isEqualTo(tutorialSetado.getTitle());
        assertThat(testTutorialSaved.getDescription()).isEqualTo(tutorialSetado.getDescription());
    }

    @Test
    public void findById_returnTutorial_whenIdTutorialExist(){
        Tutorial newTutorial = new Tutorial(null,"Titulo Test","Descricao Test",Status.DRAFT);
        Tutorial tutorialSaved = tutorialRepo.save(newTutorial);

        Optional<Tutorial>tutorialOptional = tutorialRepo.findById(newTutorial.getId());

        System.out.println(newTutorial);
        System.out.println(tutorialSaved);

        assertThat(tutorialOptional.isPresent()).isTrue();
        assertThat(tutorialOptional.get().getId()).isPositive();
        assertThat(tutorialOptional.get().getStatus()).isEqualTo(Status.DRAFT);
        assertThat(newTutorial.getTitle()).isEqualTo(tutorialSaved.getTitle());

    }

    @Test
    public void findById_returnOptionalEmpty_whenIdTutorialNotExist(){
        Optional<Tutorial>tutorialOptional = tutorialRepo.findById(1L);

        assertThat(tutorialOptional.isEmpty()).isTrue();
    }

    @Test
    public void findByStatus_returnListTutorial_whenStatusExist(){
        Tutorial newTutorial = new Tutorial(null,"Titulo 1","Descricao 1",Status.DRAFT);
        Tutorial tutorialSaved = tutorialRepo.save(newTutorial);

        List<Tutorial>tutorialList = tutorialRepo.findByStatus(Status.DRAFT);

        assertThat(tutorialList.size()).isEqualTo(1);
        assertThat(tutorialList.get(0).getId()).isEqualTo(tutorialSaved.getId());
    }
    @Test
    public void findByStatus_returnEmptyList_whenStatusNotExist(){

        List<Tutorial> listTutorial = tutorialRepo.findByStatus(Status.DRAFT);

        assertThat(listTutorial.size()).isEqualTo(0);
    }

    @Test
    public void findByStatus_returnEmptyList_whenStatusDifferent(){
        Tutorial newTutorial = new Tutorial(null,"Titulo 1","Descricao 1",Status.DRAFT);
        Tutorial tutorialSaved = tutorialRepo.save(newTutorial);

        List<Tutorial>tutorialList = tutorialRepo.findByStatus(Status.PUBLISHED);

        assertThat(tutorialList.size()).isEqualTo(0);
    }

}
