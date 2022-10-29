package com.example.storage02.controller;

import com.example.storage02.dto.AuthorDTO;
import com.example.storage02.model.Author;
import com.example.storage02.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping
    public ResponseEntity<Author> insetir(@RequestBody Author author) {

        return new ResponseEntity<>(authorService.insert(author), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> findById(@PathVariable long id) {
        Author author = authorService.findById(id);
        if (author != null) return ResponseEntity.ok(author);

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/dto/{id}")
    public ResponseEntity<AuthorDTO> getById(@PathVariable long id) {
        AuthorDTO authorDTO = authorService.getById(id);
        System.out.println(authorDTO);
        if (authorDTO != null) {
            return ResponseEntity.ok(authorDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/dto/native/{id}")
    public ResponseEntity<Author> getNativeById(@PathVariable long id) {
        Author author = authorService.nativeQueryGetById(id);
        if (author != null) {
            return ResponseEntity.ok(author);
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/dtoeagle/{id}")
    public ResponseEntity<AuthorDTO> getEagleById(@PathVariable long id) {
        AuthorDTO author = authorService.getDTOEagle(id);
        if (author != null) {
            return ResponseEntity.ok(author);
        }
        return ResponseEntity.notFound().build();
    }
}