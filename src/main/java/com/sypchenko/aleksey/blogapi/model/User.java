package com.sypchenko.aleksey.blogapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "users")
//@Builder
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    @Email
    private String login;

    @JsonIgnore
    @Column(name = "password")
    //@Size(min = 2, max = 50)
    private String password;

    @Column(name = "name")
    @Size(min = 2, max = 50)
    private String name;

    @Column(name = "description")
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "reg_date", updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm=dd hh:mm:ss")
    private Date registrationDate;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Article> articles = new ArrayList<>();

    @Enumerated(value = EnumType.STRING)
    private State state;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Token> tokens;

//    public static User from(String login, String password) {
//        return User.builder().login(login)
//                .password(password).build();
//    }

    public User(@Email String login, String password, Date registrationDate) {
        this.login = login;
        this.password = password;
        this.registrationDate = registrationDate;
    }
}
