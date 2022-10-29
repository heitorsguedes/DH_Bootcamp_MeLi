package com.example.storage_exercicio01.service;

import com.example.storage_exercicio01.model.Joia;
import com.example.storage_exercicio01.repo.JoiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class JoiaService {
    @Autowired
    private JoiaRepository joiaRepository;

    public Joia create(Joia joia) {
        return joiaRepository.save(joia);
    }

    public Joia update(Joia joia) {

        return joiaRepository.save(joia);
    }

    public Optional<Joia> findById(long cod) {
        return joiaRepository.findById(cod);
    }

    public List<Joia> findAll() {
        List<Joia> joiaList = new ArrayList<>();
        Iterator<Joia> joiaIterable = joiaRepository.findAll().iterator();
        while (joiaIterable.hasNext()) {
            joiaList.add(joiaIterable.next());
        }
        return joiaList;
    }

    public void deleteById(long cod) {
        joiaRepository.deleteById(cod);
    }
}