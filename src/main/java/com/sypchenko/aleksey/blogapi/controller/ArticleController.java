package com.sypchenko.aleksey.blogapi.controller;

import com.sypchenko.aleksey.blogapi.model.Article;
import com.sypchenko.aleksey.blogapi.service.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/articles")
    public List<Article> getAll() {
        List<Article> articles = articleService.getAllArticle();
        return articles;
    }

    @GetMapping("/articles/{id}")
    public Article getOne(@PathVariable("id") Article article) {
        return article;
    }

    //TODO - сделать добавление статьи
    //TODO - сделать удаление статьи

    @PostMapping("")
    public Article add() {
        return null;
    }
}
