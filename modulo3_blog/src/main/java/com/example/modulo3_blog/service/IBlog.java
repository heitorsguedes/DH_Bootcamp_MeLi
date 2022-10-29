package com.example.modulo3_blog.service;

import com.example.modulo3_blog.exceptions.AlreadyExistedException;
import com.example.modulo3_blog.model.Blog;

import java.util.List;

public interface IBlog {

    Blog save(Blog blog) throws AlreadyExistedException;
    Blog getById(int id);
    List<Blog> getAll();

}
