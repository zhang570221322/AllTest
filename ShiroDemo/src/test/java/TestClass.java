import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.AccountService;

import java.util.List;

/**
 * Created by zwl on 2017/9/19.
 * May god bless me
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:daobean-context.xml")
public class TestClass {
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private AccountService accountService;


    @Test
    public void test1(){
        List<String> 用户1 = accountService.getPermissionsByUserName("用户1");
        用户1.forEach(s -> {
            System.out.println(s);
        });
    }

}
