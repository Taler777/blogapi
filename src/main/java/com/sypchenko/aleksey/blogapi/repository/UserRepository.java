package com.sypchenko.aleksey.blogapi.repository;


import com.sypchenko.aleksey.blogapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
     User findByLogin(String login);
}
