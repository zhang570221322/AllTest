
import org.hibernate.SessionFactory;

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
@ContextConfiguration("classpath:root-context.xml")
public class TestClass {
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private AccountService accountService;


    @Test
    public void test1(){
        List<String> 用户1 = accountService.getPermissionsByUserName("admin");
        用户1.forEach(s -> {
            System.out.println(s);
        });
    }

    @Test
    public void testGerPermission() throws Exception {
        List<String> permissionsByUserName = accountService.getPermissionsByUserName("admin");
        permissionsByUserName.forEach(s -> {
            System.out.println(s);
        });
    }
}
