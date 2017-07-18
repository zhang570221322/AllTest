package dao;

import entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zwl on 2017/7/18.
 * May god bless me
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpringMapper {
      @Autowired
      private  ArticleMapper articleMapper;
    //测试获取单个对象
    @Test
    public void test1() {

        articleMapper.selectAll();
    }
}
