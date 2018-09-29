package com.sypchenko.aleksey.blogapi.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    @Email
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    //TODO - добавить дату регистрации сюда и в БД

}
