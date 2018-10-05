package com.sypchenko.aleksey.blogapi.controller;

import com.sypchenko.aleksey.blogapi.model.Article;
import com.sypchenko.aleksey.blogapi.service.ArticleService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public List<Article> getAll() {
        List<Article> articles = articleService.getAllArticle();
        return articles;
    }

    @GetMapping("/{id}")
    public Article getOne(@PathVariable("id") Article article) {
        return article;
    }

    @PutMapping("/{id}")
    public Article update(@PathVariable("id") Article articleFromDB, @RequestBody Article article) {
        BeanUtils.copyProperties(article, articleFromDB, "id");
        return articleService.editArticle(articleFromDB);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        articleService.deleteArticle(id);
    }

    @PostMapping("/add")
    public String create(@RequestParam("name") String name, @RequestParam("description") String description) {
        articleService.addArticle(name, description);
        ResponseEntity<Object> responseEntity = ResponseEntity.ok().build();
        if (responseEntity.getStatusCodeValue() == 200) {
            String addResult = "{" + "\"status\":" + responseEntity.getStatusCodeValue() + "," + "\"userId\":" + articleService.findByName(name).getId() + "}";
            return addResult;
        }
        return responseEntity.toString();
    }
}
