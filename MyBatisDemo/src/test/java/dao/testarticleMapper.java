package dao;

import entity.Article;
import entity.Author;
import entity.Blog;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.MyBatisUtil;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by Administrator on 2017/7/16.
 */
public class testarticleMapper {
    private SqlSession session;

    @Before
    public void before() {
        session = MyBatisUtil.getsqlSession();
    }
    @After
    public void after(){
//        MyBatisUtil.colsesqlSession(session);
    }
    //测试获取单个对象 使用 articleMapper1.xml
    @Test
    public void test1() {
        ArticleMapper articleMapper = session.getMapper(ArticleMapper.class);
        Article article = articleMapper.selectById(1);
        System.out.println(article.getArticle_blog());

    }
    private void printAB(  Blog b1, Blog b2){
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
    private void printAB(  Author b1, Author b2){
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
     //测试集合
    @Test
    public void test2() {
        ArticleMapper articleMapper = session.getMapper(ArticleMapper.class);
        LinkedList<Article> articles = articleMapper.selectAll();
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    @Test
    public void test3() {
        AuthorMapper authorMapper = session.getMapper(AuthorMapper.class);
        Author author = authorMapper.selectById(1);
        HashSet<Article> author_articles = author.getAuthor_articles();
        for (Article author_article : author_articles) {
            System.out.println(author_article.getArticle_content());
        }
    }

    @Test
    public void test4Insert() {
        ArticleMapper articleMapper = session.getMapper(ArticleMapper.class);
        Article article = articleMapper.selectById(1);
        articleMapper.insert(article);
          session.commit();
    }
    @Test
    public void test5Update() {
        ArticleMapper articleMapper = session.getMapper(ArticleMapper.class);

        Article article = articleMapper.selectById(1);
        article.setArticle_content("测试更新content");
        articleMapper.update(article);
        session.commit();
    }
}
