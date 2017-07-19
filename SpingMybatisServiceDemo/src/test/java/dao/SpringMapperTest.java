package dao;

import entity.Article;
import entity.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by zwl on 2017/7/18.
 * May god bless me
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringMapperTest {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private BlogMapper blogMapper;

    //测试获取单个对象
    @Test
    public void test1() {
        Blog blog=new Blog();
        blog.setBlogName("this is test");
        System.out.println("插入前的Id="+blog.getBlogId());
        System.out.println("对数据库影响行数 rows=" + blogMapper.insert(blog));
        System.out.println("插入后的ID=" + blog.getBlogId());
    }
}
