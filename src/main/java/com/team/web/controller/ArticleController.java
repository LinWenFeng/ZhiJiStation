package com.team.web.controller;

import com.team.domain.entity.Article;
import com.team.domain.repository.ArticleRepository;
import com.team.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by BLACK on 20123.
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleRepository repository;

    @GetMapping()
    public List<Article> getAll() {
        List<Article> articles = repository.findAll();
        return articles;
    }

    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable String id) {
        Article article = repository.findOne(id);
        return article;
    }
    @PostMapping
    public Boolean saveArticle(@RequestBody Article article, HttpSession session){
        String userName=(String) session.getAttribute("userName");
        Boolean isExists=repository.exists(Example.of(article));
        System.out.println("文章是否已存在："+isExists+"==========");
        if (!isExists){
            article.setAuthor(userName);
            article.setPublishedDateTime(DateUtil.getTime());
            repository.save(article);
            return true;
        }
        else
            return  false;
    }
    @PutMapping
    public Boolean update(@RequestBody Article article) {
        repository.save(article);
        return true;
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable String id) {
        repository.delete(id);
        return true;
    }
}
