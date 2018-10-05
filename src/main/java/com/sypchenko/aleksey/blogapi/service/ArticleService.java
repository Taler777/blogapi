package com.sypchenko.aleksey.blogapi.service;

import com.sypchenko.aleksey.blogapi.model.Article;

import java.util.List;

public interface ArticleService {
    Article addArticle(String name, String description);

    void deleteArticle(Long id);

    Article getArticleById(Long id);

    Article editArticle(Article article);

    List<Article> getAllArticle();

    Article findByName ();

}
