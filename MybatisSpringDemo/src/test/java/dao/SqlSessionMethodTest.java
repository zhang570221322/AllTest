package dao;


import domain.resultHandlerArticle;
import entity.Article;
import entity.Author;
import org.apache.ibatis.session.*;

import org.junit.Before;
import org.junit.Test;

import  org.apache.ibatis.jdbc.SqlBuilder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by  zwl on 2017/7/17.
 *  用来测试SqlSession 的一系列方法
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SqlSessionMethodTest {
    private SqlSession session;
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void before() {
        session=sqlSessionFactory.openSession(ExecutorType.REUSE);
    }
    /**
     * 用来测试
     */
    @Test
    public  void testSession(){
        Article a=new Article();
        Author author=new Author();
        session.insert("dao.AuthorMapper.insert",author);
    }
    @Test
    public void testSelectOne(){
        Author author  =   session.selectOne("dao.AuthorMapper.selectById", 1);
        System.out.println(author.getAuthor_id());
    }


    /**
     * 可以用来分页
     */
    @Test
    public void testSelectList() {
        List<Article> list = session.selectList("dao.ArticleMapper.selectAll", null, new RowBounds(1, 2));
        for (Article article : list) {
            System.out.println(article.getArticle_content());
        }
    }
        /**
         * 测试ResultHandler
         */
    @Test
    public void testSelectListHandler() {
        resultHandlerArticle resultHandler = new resultHandlerArticle();
        session.select("dao.ArticleMapper.selectAll", null,resultHandler);
    }

    @Test
    public void testSqlBuilder(){
        SqlBuilder.BEGIN();
        SqlBuilder.SELECT("username,userpassword,age");
        SqlBuilder.FROM("user");
        SqlBuilder.WHERE("usrename=1");
        SqlBuilder.GROUP_BY("gropu_id");
        System.out.println(SqlBuilder.SQL());
    }

}

