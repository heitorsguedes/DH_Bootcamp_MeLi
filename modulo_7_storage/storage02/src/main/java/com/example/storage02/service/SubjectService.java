package com.example.storage02.service;

import com.example.storage02.model.Subject;
import com.example.storage02.repository.SubjectRepo;
import org.springframework.stereotype.Service;

@Service
public class SubjectService implements ISubjectService{

    private final SubjectRepo subjectRepo;

    public SubjectService(SubjectRepo subjectoRepo){
        this.subjectRepo = subjectoRepo;

    }

    @Override
    public Subject findById(Long id) {
        return subjectRepo.findById(id).orElse(null);
    }
}
