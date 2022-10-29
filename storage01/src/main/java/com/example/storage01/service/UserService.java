package com.example.storage01.service;

import com.example.storage01.model.UserBD;
import com.example.storage01.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserBD inserir(UserBD userBD){
        return userRepo.save(userBD);
    }
    public UserBD update(UserBD userBD){
        return userRepo.save(userBD);
    }
    public Optional<UserBD> find(long cod){
        return userRepo.findById(cod);
    }

    public void delete(long cod){
        userRepo.deleteById(cod);
    }
}