package com.example.storage02.service;

import com.example.storage02.model.Subject;

import java.util.List;

public interface ISubjectService {

    Subject findById(Long id);

    //List<Subject> findAll();
}
