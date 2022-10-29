package com.example.storage_exercicio02.repository;

import com.example.storage_exercicio02.model.ENUM.Status;
import com.example.storage_exercicio02.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepo extends JpaRepository<Tutorial,Long> {

    List<Tutorial> findByTitleContaining(String title);
    List<Tutorial>findByStatus(Status status);
}
