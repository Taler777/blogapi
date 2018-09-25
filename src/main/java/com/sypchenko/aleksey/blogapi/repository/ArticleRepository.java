package com.sypchenko.aleksey.blogapi.repository;

import com.sypchenko.aleksey.blogapi.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
