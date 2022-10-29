package com.example.storage02.controller;

import com.example.storage02.model.Book;
import com.example.storage02.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable long id) {
        Book book = bookService.findById(id);

        if (book != null) return ResponseEntity.ok(book);

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        bookService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}