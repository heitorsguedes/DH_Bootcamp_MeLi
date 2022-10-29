package com.example.storage02.service;

import com.example.storage02.dto.AuthorDTO;
import com.example.storage02.model.Author;
import com.example.storage02.repository.AuthorRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService implements IAuthor {


    private AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @Override
    public Author insert(Author author) {
        author.getAddress().setAuthor(author);
        System.out.println(author.toString());
        return authorRepo.save(author);
    }

    @Override
    public Author findById(long id) {
        Optional<Author> optionalAuthor = authorRepo.findById(id);
        if (optionalAuthor.isPresent()) return optionalAuthor.get();
        return null;
    }

    @Override
    public AuthorDTO getById(long id) {
        return authorRepo.getById(id);
    }

    @Override
    public Author nativeQueryGetById(long id) {

        return authorRepo.nativeQueryGetById(id);
    }

    @Override
    public AuthorDTO getDTOEagle(long id) {
        return authorRepo.getDTOEagle(id);
    }

}