package com.sypchenko.aleksey.blogapi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "articles")
@Data
public class Article {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "user")
    //TODO - разобраться как сюда подсунуть юзера
    //private Long userId;
    private String user;

    //TODO - добавить дату и время статьи
}
