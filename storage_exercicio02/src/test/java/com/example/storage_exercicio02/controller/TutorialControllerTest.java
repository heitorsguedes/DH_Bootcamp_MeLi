package com.example.storage_exercicio02.controller;

import com.example.storage_exercicio02.model.Tutorial;
import com.example.storage_exercicio02.service.impl.TutorialService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TutorialController.class)
class TutorialControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;
    @MockBean
    private TutorialService tutorialService;

    @Test
    void insertTutorial_returnNewTutorial_whenTutorialIsValid() throws Exception {
        BDDMockito.when(tutorialService.insert(ArgumentMatchers.any(Tutorial.class)))
                .thenReturn(new Tutorial(1L, "Titulo 1", "Descricao 1", null));

        Tutorial tutorial = new Tutorial(null, "Titulo 1", "Descricao 1", null);

        ResultActions result = mockMvc.perform(post("/tutorial")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(tutorial)));

        System.out.println(objectMapper.writeValueAsString(tutorial));

        result.andExpect(status().isCreated())
                .andExpect(jsonPath("$.title", CoreMatchers.is("Titulo 1")))
                .andExpect(jsonPath("$.id",CoreMatchers.is(1)));
    }

    @Test
    void updateStatusPublished() {
    }

    @Test
    void getByTitle() {
    }

    @Test
    void getPublished() {
    }
}