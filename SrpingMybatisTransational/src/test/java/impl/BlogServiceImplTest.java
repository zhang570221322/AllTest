package impl;

import entity.Article;
import entity.Author;
import entity.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import service.impl.BlogServiceImpl;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zwl on 2017/7/18.
 * May god bless me
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BlogServiceImplTest {
    @Autowired
    private BlogServiceImpl blogServiceImpl;

    /**
     * 测试注解事物
     */
    //@Transactional 如果不加入 ，就会有一次插入异常。
    @Test
    public void testCreateBlog() {
        Blog blog = new Blog();
        blog.setBlogName("这是测试");
        Author author = new Author();
        author.setAuthorBlog(blog);
        author.setAuthorAge("22");
        author.setAuthorName("曾梦想仗剑走天涯");
        Article article1 = new Article();
        article1.setArticleTitle("春夏秋冬");
        article1.setArticleContent("蜜雪冰城");
        Article article2 = new Article();
        article2.setArticleTitle("春夏秋冬2");
        article2.setArticleContent("蜜雪冰城2");
        List<Article> articles = new LinkedList();
        articles.add(article1);
        articles.add(article2);
        blogServiceImpl.saveBlogWithAuthorArticlesTwo(author, blog, articles);

    }

}
