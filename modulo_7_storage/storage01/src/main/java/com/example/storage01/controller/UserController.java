package com.example.storage01.controller;

import com.example.storage01.model.UserBD;
import com.example.storage01.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserBD> novoUser(@RequestBody UserBD userBD) {
        System.out.println(userBD);
        UserBD newUser = userService.inserir(userBD);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping("/{cod}")
    public ResponseEntity<UserBD> findUser(@PathVariable long cod) {
        Optional<UserBD> optionalUserBD = userService.find(cod);

        if (optionalUserBD.isPresent()) {
            return new ResponseEntity<>(optionalUserBD.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping
    public ResponseEntity<UserBD> update(@RequestBody UserBD userBD) {
        UserBD userUpdate = userService.update(userBD);

        return new ResponseEntity<>(userUpdate, HttpStatus.OK);
    }

    @DeleteMapping("/{cod}")
    public ResponseEntity<Void> delete(@PathVariable long cod) {
        userService.delete(cod);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
