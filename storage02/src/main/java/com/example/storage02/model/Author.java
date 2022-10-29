package com.example.storage02.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false) //nome é obrigatorio
    private String name;

    @OneToOne(mappedBy = "author" , cascade = CascadeType.PERSIST) // Ao persistir o autor tbm sera persistido o address
    @JsonIgnoreProperties("author")
    private Address address;

    @ManyToMany
    @JoinTable(
            name = "author_books",
            joinColumns = @JoinColumn(name = "id_author", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_book", referencedColumnName = "id")
    )
    @JsonIgnoreProperties("authors")
    private Set<Book> writtenBooks;
}