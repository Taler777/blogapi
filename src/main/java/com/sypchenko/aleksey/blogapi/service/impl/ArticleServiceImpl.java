package com.sypchenko.aleksey.blogapi.service.impl;

import com.sypchenko.aleksey.blogapi.model.Article;
import com.sypchenko.aleksey.blogapi.repository.ArticleRepository;
import com.sypchenko.aleksey.blogapi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleRepository articleRepository;

    @Override
    public Article addArticle(Article article) {
        return articleRepository.saveAndFlush(article);
    }

    @Override
    public void deleteArticle(Long id) {
        if (articleRepository.existsById(id)) {
            articleRepository.deleteById(id);
        }
    }

    @Override
    public Article getArticleById(Long id) {
        return articleRepository.getOne(id);
    }

    @Override
    public Article editArticle(Article article) {
        return articleRepository.saveAndFlush(article);
    }

    @Override
    public List<Article> getAllArticle() {
        return articleRepository.findAll();
    }
}
