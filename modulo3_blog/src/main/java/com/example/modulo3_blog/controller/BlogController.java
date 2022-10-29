package com.example.modulo3_blog.controller;

import com.example.modulo3_blog.exceptions.AlreadyExistedException;
import com.example.modulo3_blog.exceptions.NotFoundException;
import com.example.modulo3_blog.model.Blog;
import com.example.modulo3_blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping
    public ResponseEntity<List<Blog>> getAll() {
        return ResponseEntity.ok(blogService.getAll());
    }
    @GetMapping(path ="/{id}")
    public ResponseEntity<Blog>getById(@PathVariable int id){

        return new ResponseEntity<>(blogService.getById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> postAll(@RequestBody Blog blog) {
        blogService.save(blog);
        return new ResponseEntity<>("Cadastrado com sucesso!! " + blog.getId(), HttpStatus.CREATED);
    }

    @ExceptionHandler
    public String handleAlreadyExistedException(AlreadyExistedException e) {
        return e.getMessage();
    }

    @ExceptionHandler
    public String handleNotFoundException(NotFoundException e){
        return e.getMessage();
    }
}
