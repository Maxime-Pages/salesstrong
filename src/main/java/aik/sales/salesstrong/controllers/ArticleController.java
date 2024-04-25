package aik.sales.salesstrong.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aik.sales.salesstrong.models.Article;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable Long id){
        return articleService.getArticleById(id);
    }
}