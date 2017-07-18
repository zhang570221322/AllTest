package dao;

import entity.Article;
import entity.Author;
import entity.Blog;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import util.MyBatisUtil;
import util.SpringBeanUtil;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by Administrator on 2017/7/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testarticleMapper {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private AuthorMapper authorMapper;
    //测试获取单个对象 使用 articleMapper1.xml
    @Test
    public void test1() {
        Article article = articleMapper.selectById(1);
        System.out.println(article.getArticle_blog().getBlog_id());
    }

    //测试集合
    @Test
    public void test2() {
        LinkedList<Article> articles = articleMapper.selectAll();
        for (Article article : articles) {
            System.out.println(article.getArticle_id());
        }
    }

    @Test
    public void test3() {
        Author author = authorMapper.selectById(1);
        HashSet<Article> author_articles = author.getAuthor_articles();
        for (Article author_article : author_articles) {
            System.out.println(author_article.getArticle_content());
        }
    }

    @Test
    public void test4Insert() {
        Article article = articleMapper.selectById(1);
        articleMapper.insert(article);
    }

    @Test
    public void test5Update() {
        Article article = articleMapper.selectById(1);
        article.setArticle_content("测试更新content");
        articleMapper.update(article);
    }
}
