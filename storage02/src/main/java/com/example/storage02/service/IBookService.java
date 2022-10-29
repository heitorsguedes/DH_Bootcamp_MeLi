package com.example.storage02.service;

import com.example.storage02.model.Book;

import java.util.List;

public interface IBookService {
    Book findById(long id);

    void deleteById(long id);

}
