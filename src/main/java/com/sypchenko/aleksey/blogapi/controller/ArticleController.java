package com.sypchenko.aleksey.blogapi.controller;

import com.sypchenko.aleksey.blogapi.model.Article;
import com.sypchenko.aleksey.blogapi.service.ArticleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }
    @RequestMapping("/articles")
    public List<Article> showArticlesList() {
        List<Article> articles = articleService.getAllArticle();
        return articles;
    }

}
