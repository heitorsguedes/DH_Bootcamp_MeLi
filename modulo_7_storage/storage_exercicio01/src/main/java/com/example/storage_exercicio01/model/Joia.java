package com.example.storage_exercicio01.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "tb_joia")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Joia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 30, nullable = false)
    private String material;

    @Column(nullable = false)
    private double pesoKg;

    @Column(nullable = false)
    private int quilates;


}
