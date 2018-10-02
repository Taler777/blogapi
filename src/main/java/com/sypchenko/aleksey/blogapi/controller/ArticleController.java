package com.sypchenko.aleksey.blogapi.controller;

import com.sypchenko.aleksey.blogapi.model.Article;
import com.sypchenko.aleksey.blogapi.service.ArticleService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/articles/add")
    public String create(@RequestBody Article article) {
        //article.setCreateDate(new Date());
        articleService.addArticle(article);
        return "redirect:/articles";
    }

    @PutMapping("/articles/{id}")
    public Article update(
            @PathVariable("id") Article articleFromDB,
            @RequestBody Article article) {
        BeanUtils.copyProperties(article, articleFromDB, "id");
        return articleService.editArticle(articleFromDB);
    }

    @DeleteMapping("/articles/{id}")
    public void delete(@PathVariable("id") Long id) {
        articleService.deleteArticle(id);
    }
}
