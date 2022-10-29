package com.example.storage01.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@Entity //indica que essa classe sera persistida
@Table(name = "tb_user")//nome dado a tabela no bd - (opcional)
public class UserBD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//gera automaticamento 1,2,3,4....
    private long cod;

    @Column(length = 150, nullable = false)
    private String name;

    @Column(name = "e_mail", length = 150, unique = true)
    private String email;
}