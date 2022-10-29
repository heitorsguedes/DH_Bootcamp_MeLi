package com.example.storage02.controller;

import com.example.storage02.model.Subject;
import com.example.storage02.service.SubjectService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("{id}")
    public ResponseEntity<Subject> getById(@PathVariable long id) {
        Subject subject = subjectService.findById(id);

        if (subject != null) {
            return ResponseEntity.ok(subject);
        }
        return ResponseEntity.notFound().build();
    }

}
