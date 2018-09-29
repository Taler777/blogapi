package com.sypchenko.aleksey.blogapi.controller;

import com.sypchenko.aleksey.blogapi.service.ArticleService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }


}
