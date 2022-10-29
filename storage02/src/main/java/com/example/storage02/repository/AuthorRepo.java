package com.example.storage02.repository;

import com.example.storage02.dto.AuthorDTO;
import com.example.storage02.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepo extends JpaRepository<Author, Long> {
    //HQL
    @Query("SELECT a FROM Author a WHERE a.id = ?1")
    AuthorDTO getById(long id);
    @Query(value = "SELECT * FROM author WHERE id = ?1", nativeQuery = true)
    Author nativeQueryGetById(long id);

    //Da para usar o EAGLE com query do Hibernate abaixo
    @Query("SELECT a FROM Author a LEFT JOIN a.address WHERE a.id = :id" ) //:id pega pelo nome do parametro,
    AuthorDTO getDTOEagle(long id);
}