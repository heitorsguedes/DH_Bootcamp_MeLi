package com.example.storage_exercicio02.controller;

import com.example.storage_exercicio02.model.ENUM.Status;
import com.example.storage_exercicio02.model.Tutorial;
import com.example.storage_exercicio02.service.i.ITutorial;
import com.example.storage_exercicio02.service.impl.TutorialService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("tutorial")
public class TutorialController {
    @Autowired
    private TutorialService tutorialService;

    @PostMapping
    public ResponseEntity<Tutorial> insertTutorial(@RequestBody Tutorial tutorial) {
        Tutorial newTutorial = tutorialService.insert(tutorial);
        return new ResponseEntity<>(newTutorial, HttpStatus.CREATED);
    }

    @PatchMapping("/{id}/published")
    public ResponseEntity<Tutorial> updateStatusPublished(@PathVariable Long id) {

        Optional<Tutorial> optionalTutorial = tutorialService.getById(id);
        if (optionalTutorial.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Tutorial tutorial = optionalTutorial.get();
        tutorial.setStatus(Status.PUBLISHED);
        tutorial = tutorialService.update(tutorial);

        return new ResponseEntity<>(tutorial, HttpStatus.OK);
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<List<Tutorial>> getByTitle(@PathVariable String title) {
        List<Tutorial> tutorialList = tutorialService.getByTitle(title);
        return new ResponseEntity<>(tutorialList, HttpStatus.OK);
    }

    @GetMapping("/published")
    public ResponseEntity<List<Tutorial>> getPublished() {
        List<Tutorial> listPublished = tutorialService.getPublished();
        return new ResponseEntity<>(listPublished, HttpStatus.OK);

    }
}