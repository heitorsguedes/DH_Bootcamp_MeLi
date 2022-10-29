package com.example.storage_exercicio02.integration;

import com.example.storage_exercicio02.model.Tutorial;
import com.example.storage_exercicio02.service.impl.TutorialService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
@ActiveProfiles("test")
public class TutorialControllerTestIT {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void insertTutorial_returnNewTutorial_whenTutorialIsValid() throws Exception {
        Tutorial tutorial = new Tutorial(null, "Titulo 1", "Descricao 1", null);

        ResultActions result = mockMvc.perform(post("/tutorial")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(tutorial)));

        result.andExpect(status().isCreated())
                .andExpect(jsonPath("$.title", CoreMatchers.is("Titulo 1")))
                .andExpect(jsonPath("$.id",CoreMatchers.notNullValue()));
    }
}
