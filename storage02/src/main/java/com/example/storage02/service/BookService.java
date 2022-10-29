package com.example.storage02.service;

import com.example.storage02.model.Book;
import com.example.storage02.repository.BookRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BookService implements IBookService {

    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book findById(long id) {
//        Optional<Book> optionalBook = bookRepo.findById(id);
//        if (optionalBook.isPresent()) return optionalBook.get();
//        return null;

        return bookRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(long id) {
        bookRepo.deleteById(id);
    }
}
