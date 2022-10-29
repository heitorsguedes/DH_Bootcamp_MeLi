package com.example.storage02.service;

import com.example.storage02.dto.AuthorDTO;
import com.example.storage02.model.Author;

public interface IAuthor {

    Author insert(Author author);
    Author findById(long id);

    AuthorDTO getById(long id);
    Author nativeQueryGetById(long id);

    AuthorDTO getDTOEagle(long id);
}
