package com.example.storage_exercicio02.model;

import com.example.storage_exercicio02.model.ENUM.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50 , nullable = false)
    private String title;

    @Column(length = 100)
    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;

}
