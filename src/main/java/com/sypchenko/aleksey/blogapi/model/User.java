package com.sypchenko.aleksey.blogapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //TODO - сделать валидацию email и password
    @Column(name = "email")
    @Email
    private String login;

    @JsonIgnore
    @Column(name = "password", nullable = false)
    @Size(min=5, message = "password must be at least 5 characters")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    //@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "reg_date", updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd hh:mm:ss")
    private LocalDateTime registrationDate;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Article> articles = new ArrayList<>();

    @Enumerated(value = EnumType.STRING)
    private Role role;

    public User(@Email String login, String password) {
        this.login = login;
        this.password = password;
        this.registrationDate = LocalDateTime.now();
        this.role = Role.USER;
    }
}
