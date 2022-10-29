package com.example.storage02.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private long id;

    @Column( length = 50 , nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "id_subject")
    @JsonIgnoreProperties("listBooks")
    private Subject subject;

    @ManyToMany(mappedBy = "writtenBooks")
    @JsonIgnoreProperties("writtenBooks")
    private Set<Author>authors;
}
