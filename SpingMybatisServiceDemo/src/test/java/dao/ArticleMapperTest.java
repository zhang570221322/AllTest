package dao;

import entity.Article;
import entity.Author;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by Administrator on 2017/7/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ArticleMapperTest {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private AuthorMapper authorMapper;
    //测试获取单个对象 使用 articleMapper1.xml
    @Test
    public void test1() {
        Article article = articleMapper.getById(1);
        System.out.println(article.getArticleBlog().getBlogId());
    }

    //测试集合
    @Test
    public void test2() {
        LinkedList<Article> articles = articleMapper.listAll();
        for (Article article : articles) {
            System.out.println(article.getArticleId());
        }
    }

    @Test
    public void test3() {
        Author author = authorMapper.getById(3);
        HashSet<Article> author_articles = author.getAuthorArticles();
        for (Article author_article : author_articles) {
            System.out.println(author_article.getArticleContent());
        }
    }

    @Test
    public void test4Insert() {
        Article article =  new Article();
        article.setArticleContent("test");
        article.setArticleTitle("test");
        articleMapper.insert(article);
    }

    @Test
    public void test5Update() {
        Article article = articleMapper.getById(2);
        article.setArticleContent("测试更新content");
        articleMapper.update(article);
    }
}
