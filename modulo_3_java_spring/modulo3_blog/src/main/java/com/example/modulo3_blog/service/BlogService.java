package com.example.modulo3_blog.service;

import com.example.modulo3_blog.exceptions.AlreadyExistedException;
import com.example.modulo3_blog.exceptions.NotFoundException;
import com.example.modulo3_blog.model.Blog;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlog {
    private static final List<Blog> listBlog = new ArrayList<>(
            List.of(
                    new Blog(1, "Comento tudo que é amarelo", "heitor", LocalDate.of(2022, 9, 10)),
                    new Blog(2, "Comento tudo que é verde", "heitor", LocalDate.of(2022, 10, 10)),
                    new Blog(3, "Comento tudo que é azul", "heitor", LocalDate.of(2022, 11, 10))
            )
    );

    @Override
    public Blog save(Blog blog) {
        Optional<Blog> optionalBlog = getAll().stream().filter(b -> b.getId() == blog.getId()).findFirst();
        if (optionalBlog.isPresent()) throw new AlreadyExistedException("Id já cadastrado");
        listBlog.add(blog);
        return blog;
    }

    @Override
    public Blog getById(int id) {
        Optional<Blog> optionalBlog = getAll().stream().filter(b -> b.getId() == id).findFirst();
        if (optionalBlog.isEmpty()) throw new NotFoundException("Post nao encontrado! Id:" + id);
        return optionalBlog.get();
    }

    @Override
    public List<Blog> getAll() {
        return listBlog;
    }
}
